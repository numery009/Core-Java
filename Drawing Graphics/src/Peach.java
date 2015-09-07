import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fill3DRect(25, 120, 100, 30, true);
		
		g.setColor(Color.RED);
		g.drawString("this is some text", 25, 180);
		
		g.setColor(Color.GREEN);
		g.drawLine(25, 200, 200, 200);
		
		g.setColor(Color.RED);
		g.drawRect(25, 210, 100, 30);
				
		g.setColor(Color.RED);
		g.fillOval(25, 250, 100, 30);
	}
}
