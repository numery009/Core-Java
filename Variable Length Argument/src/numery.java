
public class numery {
	public static void main (String[] Args){
		System.out.println(Arguments(10,20,40,100,200));
	}
	
	public static int Arguments(int...Numbers){
		int total=0;
		for(int x:Numbers)
			total+=x;
		
		return total/Numbers.length;
	}
}
