import java.io.File;

public class apples {
	public static void main (String[] args){
		File x =new File("C:\\test\\Test.Java");
		
		if(x.exists()){
			System.out.println(x.getName() + " exists");
		}
		else{
			System.out.println("This file doesnot exists");
		}
	}
}
