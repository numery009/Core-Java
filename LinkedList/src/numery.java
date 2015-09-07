import java.util.*;

import javax.swing.JTable.PrintMode;

public class numery {
	public static void main(String args[]){
		String[] things={"apples","noobs","pwnge","bacon","goats"};
		List<String> list1=new LinkedList<String>();
		for(String x:things){
			list1.add(x);
		}
		String[] morethings= {"sausage","bacon","goats","harrypotter"};
		List<String> list2=new LinkedList<String>();
		for(String y: morethings){
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2=null;
		
		PrintMe(list1);
		RemoveStuff(list1,2,5);
		PrintMe(list1);
		ReverseMe(list1);
	}
	
	//Print all stuff//
	public static void PrintMe(List<String> l){
		for(String x: l){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	//Remove stuff from the list
	public static void RemoveStuff(List<String> l,int from, int to ){
		l.subList(from, to).clear();
	}
	public static void ReverseMe(List<String> l){
		ListIterator<String> bobby=l.listIterator(l.size());
		while(bobby.hasPrevious()){
			System.out.printf("%s ", bobby.previous());
		}
	}
}
