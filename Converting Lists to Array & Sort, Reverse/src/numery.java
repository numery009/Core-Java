import java.awt.peer.SystemTrayPeer;
import java.util.*;
public class numery {
	public static void main(String args[]){
		String[] stuff={"babies","watermelong","melons","fudge"};
		//Working with LinkedList
		LinkedList<String> theList=new LinkedList<String>(Arrays.asList(stuff));		
		
		theList.addFirst("pumkine");
		theList.add("lastThing");
		
		stuff=theList.toArray(new String[theList.size()]);
		System.out.printf("%s",theList);
		System.out.println();
		for (String x: stuff){
			System.out.printf("%s ",x);
		}
		
		System.out.println();
		
		// Working with List
		String[] stuff1={"babies","watermelong","melons","fudge"};
		List<String> theL=new LinkedList<String>(Arrays.asList(stuff1));
		theL.add("pumkine");
		theL.add("lastThing");
		
		stuff1=theL.toArray(new String[theL.size()]);		
		System.out.printf("%s",theL);
		System.out.println();
		for (String x: stuff1){
			System.out.printf("%s ",x);
		}
		
		
		// Collection Method Sort		
		//String[] crap={"apples","lemons","geese","bacon","youtube"};
		System.out.println();
		System.out.println("------------Printing Collection Sort & Reverse-----------");
		
		Collections.sort(theList);
		System.out.printf("%s",theList);
		System.out.println();
		for(String x: theList){
			System.out.printf("%s ",x);
		}
		// Collection Reverse Method
		System.out.println();
		Collections.sort(theList,Collections.reverseOrder());
		System.out.printf("%s",theList);
		System.out.println();
		for(String x: theList){
			System.out.printf("%s ",x);
		}
		//Collection Method Sort
		System.out.println();
		Collections.sort(theL);
		System.out.printf("%s",theL);
		System.out.println();
		for(String x: theL){
			System.out.printf("%s ",x);
		}
		// Collection Reverse Method
		System.out.println();
		Collections.sort(theL,Collections.reverseOrder());
		System.out.printf("%s",theL);
		System.out.println();
		for(String x: theL){
			System.out.printf("%s ",x);
		}
		
		System.out.println();
		System.out.println("------------ADD ALL Method-----------");
		
		ArrayList<String> l= new ArrayList<String>();
		l.add("Numery");
		l.add("Zaber");
		Collections.addAll(l,stuff);
		
		System.out.println();
		for(String x: l){
			System.out.printf("%s ",x);
		}
		
		System.out.println("------------Frequency & Disjoint Method-----------");
		
		System.out.println(Collections.frequency(theList, "melons"));
		System.out.println(Collections.disjoint(theList, theL));
	}
}
