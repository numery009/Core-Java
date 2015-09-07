import java.util.Scanner;

public class apple {
	private static Scanner numery;

	public static void main (String args[])
	{
		numery = new Scanner(System.in); 
		tuna tunaobject =new tuna();
		System.out.println("Enter you first gf name");
		String temp =numery.nextLine();
		tunaobject.setName(temp);
		tunaobject.saying();
	}	
}
