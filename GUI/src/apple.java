import javax.swing.JOptionPane;

public class apple {
	public static void main(String args[]){
		String fd=JOptionPane.showInputDialog("Enter your First No");
		String sd=JOptionPane.showInputDialog("Enter your Second No");
		
		int num1=Integer.parseInt(fd);
		int num2=Integer.parseInt(sd);
		int total=num1+num2;
		
		JOptionPane.showMessageDialog(null,"The answer is"+total,"Answer",JOptionPane.PLAIN_MESSAGE);
	}
}
