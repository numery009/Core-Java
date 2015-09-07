import javax.swing.JFrame;

public class numery {
	public static void main(String args[]){
		Client C=new Client("127.0.0.1");
		C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		C.startRunning();
	}
}
