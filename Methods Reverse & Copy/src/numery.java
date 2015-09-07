import java.util.*;

public class numery {
	public static void main(String args[]){
		
		//Create an Array and convert to List
		Character[] ray={'p','w','n' };
		List<Character> l=Arrays.asList(ray);
		System.out.println("List is : ");
		output(l);
		
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("List is : ");
		output(l);
		
		//Create a new array and a new list
		Character[] newRay =new Character[3];
		List<Character> listCopy=Arrays.asList(newRay);
		
		//Copy contents to list into NewList
		Collections.copy(listCopy,l);
		System.out.println("Copy of list : ");
		output(listCopy);
		
		
		//fill collection with crap
		Collections.fill(l, 'X');
		System.out.println("Fill of list : ");
		output(l);		
		
		
	}
	
	private static void output(List<Character> LC) {
		for(Character x: LC){
			System.out.printf("%s ",x);			
		}
		System.out.println();
	}
}
