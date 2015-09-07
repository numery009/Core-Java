import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends JFrame{
	private JTextField tf;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	
	public GUI(){
		super("The Title");
		setLayout(new FlowLayout());
		
		tf =new JTextField("This is a sentence ",20);
		tf.setFont(new Font("Sherif",Font.PLAIN,14));
		add(tf);
		
		boldBox =new JCheckBox("bold");
		italicBox=new JCheckBox("italic");
		add(boldBox);
		add(italicBox);
		
		HandlerClass handler =new HandlerClass();
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
	}
	private class HandlerClass implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			 Font font=null;
			 
			if(boldBox.isSelected() && italicBox.isSelected()){
				font=new Font("Sherif",Font.BOLD + Font.ITALIC,14);				
			}
			else if(boldBox.isSelected()){
				font=new Font("Sherif",Font.BOLD,14);				
			}
			else if(italicBox.isSelected()){
				font=new Font("Sherif",Font.ITALIC,14);
			}
			else {
				font=new Font("Sherif",Font.PLAIN,14);
			}
			tf.setFont(font);
		}
		
	}
}
