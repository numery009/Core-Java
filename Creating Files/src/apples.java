import java.util.*;

public class apples {
	public static void main(String args[]){
		final Formatter x;
		try{
			x=new Formatter("numery.txt");
			System.out.println("you created a file.");			
		}
		catch(Exception e){
			System.out.println("you got an error");
		}
	}
}
