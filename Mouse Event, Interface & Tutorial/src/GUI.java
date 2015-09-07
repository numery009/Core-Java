import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public GUI(){
		super("The Title");
		
		mousepanel =new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar =new JLabel("default");
		add(statusbar,BorderLayout.SOUTH);
		
		HandlerClass handler =new HandlerClass();
		mousepanel.addMouseListener(handler);
		statusbar.addMouseMotionListener(handler);
		
	}
	
	private class HandlerClass implements MouseListener,MouseMotionListener{
		
		public void mouseDragged(MouseEvent e) {			
			statusbar.setText("You are dragging the mouse");			
		}
		
		public void mouseMoved(MouseEvent e) {			
			statusbar.setText("You move the mouse");
		}
	
		public void mouseClicked(MouseEvent e) {
			statusbar.setText(String.format("Clicked at %d,%d", e.getX(),e.getY()));		
		}
		
		public void mouseEntered(MouseEvent e) {			
			statusbar.setText("You enter the area");
			mousepanel.setBackground(Color.RED);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			statusbar.setText("The mouse exit the area");
			mousepanel.setBackground(Color.WHITE);			
		}
		
		public void mousePressed(MouseEvent e) {		 
			statusbar.setText("You pressed down the mouse");
		}
		
		public void mouseReleased(MouseEvent e) {			 
			statusbar.setText("You released the button");
		}
		
	}
}
