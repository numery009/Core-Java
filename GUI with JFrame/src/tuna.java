import java.awt.FlowLayout;
import javax.swing.JFrame; 
import javax.swing.JLabel;

public class tuna extends JFrame {
	public JLabel item1;
	public tuna(){
		super("The title bar");
		setLayout (new FlowLayout());
		item1=new JLabel("this is a sentence");
		item1.setToolTipText("This is the TooltipText");
		add(item1);
	}
}
