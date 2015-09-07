import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Server extends JFrame{
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	//constructor
	public Server(){
		super("Numerys Instant Messanger (Server)");
		userText =new JTextField();
		userText.setEditable(false);
		userText.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendMessage(e.getActionCommand());
				userText.setText("");
			}
		});
		add(userText,BorderLayout.NORTH);
		chatWindow=new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
	}
	public void startRunning(){
		try{
			server=new ServerSocket(6789,100);
			while(true){
				try{
					waitForConnection();
					setupStreams();
					whileChatting();
				}
				catch(EOFException eofexception){
					showMessage("\n server ended the connection!");
				}
				finally{
					closeCrap();
				}
			}
		}
		catch(IOException ioexception){
			ioexception.printStackTrace();
		}
	}
	//wait for connection, then display connection information 
	private void waitForConnection() throws IOException{
		showMessage("Waiting for someone to connect..\n");
		connection=server.accept();
		showMessage(" Now connected to " + connection.getInetAddress().getHostName());		
	}
	
	//get stream to send and receive data	
	private void setupStreams() throws IOException{
		output =new  ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input=new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setup!\n");
	}
	
	//during the chat conversation(){
	private void whileChatting() throws IOException{
		abletoType(true);
		String message= "You are now connected";
		sendMessage(message);
		
		do{
			try{
				message=(String)input.readObject();
				showMessage("\n"+ message);
			}
			catch(ClassNotFoundException classnotfoundexception){
				showMessage("\n idk wtf that user send!\n");
			}
		}while(!message.equals("CLIENT - END"));
	}

	private void closeCrap(){
		showMessage("\n Colsing connections\n");
		abletoType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException ioexception){
			ioexception.printStackTrace();
		}
	}
	
	// send a message to client
	private void sendMessage(String message){
		try{
			output.writeObject("Server- "+message);
			output.flush();
			showMessage("\nServer- " + message);
		}
		catch(IOException ioexception){
			chatWindow.append("\n Error: Dude I cant send the message.");
		}
	}
	
	// updates chat window
	private void showMessage(final String text){
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				chatWindow.append(text);
			}
		});
	}
	
	//let the user type stuff into their box
	private void abletoType(final boolean tof){
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				userText.setEditable(tof);
			}
		});
	}
	
	
	

}
