import java.util.Scanner;

public class apples {
	public static void main (String args[]){
		Scanner Numery=new Scanner(System.in);
		double first,second,sum,sub,mul,div,remainder;
		System.out.print("Enter first num: ");		
		first=Numery.nextDouble();
		System.out.print("Enter second num: ");
		second=Numery.nextDouble();
		sum=first+second;
		System.out.print("SUM: ");
		System.out.println(sum);
		
		sub=first-second;
		System.out.print("SUB: ");
		System.out.println(sub);
		
		
		mul=first*second;
		System.out.print("MUL: ");
		System.out.println(mul);
		
		
		div=first/second;
		System.out.print("DIV: ");
		System.out.println(div);

		remainder=first%second;
		System.out.print("REM: ");
		System.out.println(remainder);
		
	}
}
