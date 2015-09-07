import java.util.Scanner;


public class Apples {
	public static void main (String args[]){
		Scanner Numery=new Scanner(System.in);
		int tuna=5;
		int boss=8;
		
		boss=boss+5;
		System.out.println(boss);
		
		boss+=5;
		System.out.println(boss);
		
		boss*=5;
		System.out.println(boss);
		
		System.out.println(tuna++);
		System.out.println(++tuna);
	}
}
