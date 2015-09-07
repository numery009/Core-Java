import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Client extends JFrame{
	private JTextField usertext;
	private JTextArea chatwindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message="";
	private String serverIP;
	private Socket connection;
	
	//Constructor	
	public Client(String host){
		super("Client mofo!");
		serverIP=host;
		usertext= new JTextField();
		usertext.setEditable(false);
		usertext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendMessage(e.getActionCommand());
				usertext.setText("");
			}
		});		
		add(usertext,BorderLayout.NORTH);
		chatwindow=new JTextArea();
		add(new JScrollPane(chatwindow),BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
	}
	
	//connect to server
	public void startRunning(){
		try{
			connectToServer();
			setupStreams();
			whileChatting();
		}
		catch(EOFException eofexception){
			showMessage("\n Client terminated connection");
		}
		catch(IOException ioexception){
			ioexception.printStackTrace();
		}
		finally{
			closeCrap();
		}
	}
	
	//connect to server
	private void connectToServer() throws IOException{
		showMessage("Attempting connection..\n");
		connection =new Socket(InetAddress.getByName(serverIP),6789);
		showMessage("\nConnected to:" + connection.getInetAddress().getHostName());
	}
	// setting up the stream
	private void setupStreams() throws IOException{
		output =new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input=new ObjectInputStream(connection.getInputStream());
		showMessage("Dude your streams are now good to go!\n");
	}
	//while chatting with server
	private void whileChatting() throws IOException{
		ableToType(true);
		do{
			try{
				message =(String)input.readObject();
				showMessage("\n"+ message);
			}
			catch(ClassNotFoundException classnotfound){
				showMessage("\n I dont know that object type");
			}
			
		}while(!message.equals("SERVER - END"));
	}
	//Close the streams and sockets
	private void closeCrap(){
		showMessage("\n closing crap down");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Send message to Server
	private void sendMessage(String  message){
		try{
			output.writeObject("Client - "+ message);
			output.flush();
			showMessage("\nClient - " + message);
		}
		catch(IOException ioexception){
			chatwindow.append("\n something messed up sending message hoss!");
		}
	}
	//change/update chatWindow
	private void showMessage(final String m){
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				chatwindow.append(m);
			}
		});
	}
	//gives user permission to type crap into the text box
	private void ableToType(final boolean tof){
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				usertext.setEditable(tof);
			}
		});
	}
}
