import java.util.*;

public class numery {
	public static void main(String args[]){
		Stack<String> stack =new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		PullAllElement(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);		
	}
	
	private static void printStack(Stack<String> S){
		if(S.isEmpty()){
			System.out.println("You have nothing in your stack");
		}
		else{
			System.out.printf("%s Top", S);
			System.out.println();
		}			
	}
	
	private  static void PullAllElement(Stack<String> S){
		for(String x:S){
			System.out.printf("%s ",x);			
		}
		System.out.println();
	}

}