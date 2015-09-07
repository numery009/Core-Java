import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame{
	
	private JSlider slider;
	private DrawOval mypanel;
	
	public TheWindow(){
		super("The title");
		mypanel =new DrawOval();
		mypanel.setBackground(Color.ORANGE);
		
		slider=new JSlider(SwingConstants.HORIZONTAL,0,200,10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				mypanel.setD(slider.getValue());
			}
		});
		
		add(slider,BorderLayout.SOUTH);
		add(mypanel, BorderLayout.CENTER);
	}
}
