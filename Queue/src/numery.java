import java.util.*;
public class numery {
	public static void main(String args[]){
		PriorityQueue<String> PQ=new PriorityQueue<String>();
		
		PQ.offer("1st");
		PQ.offer("2nd");
		PQ.offer("3rd");
		
		System.out.printf("%s", PQ);
		System.out.println();
		
		System.out.printf("%s ",PQ.peek());
		System.out.println();

		PQ.poll();
		System.out.printf("%s ",PQ);
		System.out.println();
		
		for(String x:PQ){
			System.out.printf("%s ",x);
		}		
	}
}
