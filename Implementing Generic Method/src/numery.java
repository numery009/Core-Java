import java.util.*;
public class numery {
	public static void main(String args[]){
		Integer[] iray={1,2,3,4,5};
		Character[] cray={'a','b','c','d','e'};
		
		printMe(iray);
		printMe(cray);
	}
	
	public static <G> void printMe(G[] g){
		for(G x:g){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
}
