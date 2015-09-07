import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame {
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public Layout(){
		super("The Title");
		layout =new FlowLayout();
		container =getContentPane();
		setLayout(layout);
		
		lb=new JButton("left");
		add(lb);
		lb.addActionListener(new ActionListener() {						
			public void actionPerformed(ActionEvent e) {				
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
			}
		});
		
		lb=new JButton("right");
		add(lb);
		lb.addActionListener(new ActionListener() {						
			public void actionPerformed(ActionEvent e) {				
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
			}
		});
		
		lb=new JButton("center");
		add(lb);
		lb.addActionListener(new ActionListener() {						
			public void actionPerformed(ActionEvent e) {				
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
		});
	}
}
