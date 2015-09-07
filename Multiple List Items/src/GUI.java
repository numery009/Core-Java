import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {
	private JList leftList;
	private JList rightList;
	private JButton movebutton;
	
	private static String[] foods={"bacon","wings","ham","beef","more"};
	
	public GUI(){
		super("Title");
		setLayout(new FlowLayout());
		
		leftList=new JList(foods);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftList));
		
		movebutton=new JButton("MOVE-->");
		movebutton.addActionListener(
			new ActionListener() {						
				public void actionPerformed(ActionEvent event) {
					rightList.setListData(leftList.getSelectedValues());				
				}
			});
		add(movebutton);
		
		rightList =new JList();
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellWidth(100);
		rightList.setFixedCellHeight(15);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
	}
}
