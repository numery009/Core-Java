import java.io.*;
import java.util.*;

public class readFile {
	private Scanner x;
	public void openFile(){
		try{
			x=new Scanner(new File("numery.txt"));
		}
		catch(Exception ex){
			System.out.println("Could not find file");
		}		
	}
	public void ReadFile (){
		while (x.hasNext()){
			String a=x.next();
			String b=x.next();
			String c=x.next();
			
			System.out.printf("%s %s %s\n", a,b,c);
		}
	}
	
	public void closeFile(){
		x.close();
	}
}
