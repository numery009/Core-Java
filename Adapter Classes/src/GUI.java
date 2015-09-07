import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
	private String details;
	private JLabel statusbar;
	
	public GUI(){
		super("This is Title");
		
		statusbar=new JLabel("This is Default");
		add(statusbar,BorderLayout.SOUTH);
		
		MouseClass MC =new MouseClass();
		addMouseListener(MC);					
	}
	private class MouseClass extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			details =String.format("You Clicked %d", e.getClickCount());
			
			if(e.isMetaDown())
				details+="with right mouse button";
			else if(e.isAltDown())
				details+="with center mouse button";
			else
				details+="with left mouse button";
			statusbar.setText(details);
		}
	}
}

