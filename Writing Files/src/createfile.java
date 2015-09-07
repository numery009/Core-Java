import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {
	private Formatter x;
	public void openFile(){
		try{
			x=new Formatter("numery.txt");
		}
		catch(Exception ex){
			System.out.println("You have an error");
		}		
	}
	public void addRecords(){
		x.format("%s\t%s\t%s\n", "20","bucky", "robets");
		x.format("%s\t%s\t%s\n", "30","numery", "Good Boy");
	}
	public void closeFile(){
		x.close();
	}
}
