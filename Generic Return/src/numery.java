import java.util.*;

public class numery {
	public static void main(String args[]){
		System.out.println(max(1,2,3));
		System.out.println(max("aa","bb","cc"));
		System.out.println(max('a','b','c'));
	}
	
	public static <T extends Comparable<T>> T max(T a,T b,T c){
		T m=a;
		if(b.compareTo(m)>0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
		return m;
	}	
}
