import java.awt.*;
import javax.swing.*;

public class numery extends JApplet{
	private double sum;
	public void init(){
		String fn=JOptionPane.showInputDialog("Enter 1st Number");
		String sn=JOptionPane.showInputDialog("Enter 2nd Number");
		
		double n1=Double.parseDouble(fn);
		double n2=Double.parseDouble(sn);
		
		sum=n1+n2;
	}
	
	public void paint (Graphics g){
		super.paint(g);
		g.drawString("The sum is " + sum, 25, 30);
		g.setColor(Color.RED);
	}
}
