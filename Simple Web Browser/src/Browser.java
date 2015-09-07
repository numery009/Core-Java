import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Browser extends JFrame {
	private JTextField addressBar;
	private JEditorPane display;
	
	public Browser() {
		// TODO Auto-generated constructor stub
		super("Numery Browser");
		addressBar=new JTextField("enter a URL~");
		addressBar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loadCrap(e.getActionCommand());
			}
		});
		add(addressBar,BorderLayout.NORTH);
		display=new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				if(e.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
					loadCrap(e.getURL().toString());
				}
			}
		});
		add(new JScrollPane(display),BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
	}
	private void loadCrap(String userText) {
		try{
			display.setPage(userText);
			addressBar.setText(userText);
		}
		catch(Exception e){
			System.out.println("Crap!");
		}
	}
}
