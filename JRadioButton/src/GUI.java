import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class GUI extends JFrame {
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public GUI(){
		super("The Title");
		setLayout(new FlowLayout());
		tf=new JTextField("Bucky is awesome and hot",25);
		add(tf);
		
		pb=new JRadioButton("Plain",true);
		bb=new JRadioButton("Bold",false);
		ib=new JRadioButton("Italic",false);
		bib=new JRadioButton("Bold & Italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group =new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf=new Font("Serif",Font.PLAIN,14);
		bf=new Font("Serif",Font.BOLD,14);
		itf=new Font("Serif",Font.ITALIC,14);
		bif=new Font("Serif",Font.BOLD + Font.ITALIC,14);
		
		tf.setFont(pf);
		// wait for event to happen pass in front object to constructor
		//pb.addItemListener(new HandlerClass(pf));
		//bb.addItemListener(new HandlerClass(bf));
		//ib.addItemListener(new HandlerClass(itf));
		//bib.addItemListener(new HandlerClass(bif));
		
		HandlerClass HC=new HandlerClass();
		bib.addItemListener(HC);
		bb.addItemListener(HC);
		ib.addItemListener(HC);
		pb.addItemListener(HC);
	}
	
	//private class HandlerClass implements ItemListener{
	//	private Font font;
		
		// the font object get variable font
	//	public HandlerClass(Font f){
	//	font=f;
	//	}
		//sets the font to the font object that was passed in		
	//	public void itemStateChanged(ItemEvent event) {
	//		tf.setFont(font);
			
	//	}
		
	//}
	
	
private class HandlerClass implements ItemListener{
		
		public void itemStateChanged(ItemEvent e) {
			 Font font=null;
			 
			if(bib.isSelected()){
				font=new Font("Sherif",Font.BOLD+ Font.ITALIC,14);				
			}
			else if(bb.isSelected()){
				font=new Font("Sherif",Font.BOLD,14);				
			}
			else if(ib.isSelected()){
				font=new Font("Sherif",Font.ITALIC,14);
			}
			else {
				font=new Font("Sherif",Font.PLAIN,14);
			}
			tf.setFont(font);
		}
		
	}
}
