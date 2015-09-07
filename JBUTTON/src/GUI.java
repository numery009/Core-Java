import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUI extends JFrame {
	
	private JButton reg;
	private JButton custom;
	
	public GUI (){
		super("This is a Title");
		setLayout(new FlowLayout());
		
		reg =new JButton("reg Button");
		add(reg);
		
		Icon D=new ImageIcon(getClass().getResource("Desert.jpg"));
		Icon L=new ImageIcon(getClass().getResource("Lighthouse.jpg"));
		
		custom =new JButton("Custom",D);
		custom.setRolloverIcon(L);
		add(custom);
		
		HandlerClass handler =new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
		}
	}
	
}
