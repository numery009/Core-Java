import java.awt.*;
import javax.swing.*;

public class numery extends JApplet{	
	public void Paint(Graphics G){	
		super.paint(G);
		G.drawString("This is my 1st applet project.", 30, 50);		
		G.setColor(Color.RED);
	}
	//public numery(){
	//	super("Title");
	//	setLayout(new FlowLayout());
	//	JLabel l=new JLabel();
	//	l.setText("Hello World");
	//	add(l);
	//}
}
