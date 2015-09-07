import javax.swing.*;

public class Numery {
	public static void main(String args[]){
		JFrame JF=new JFrame("Title");
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach P=new Peach();
		JF.add(P);
		JF.setSize(400, 150);
		JF.setVisible(true);
	}
}
