
public class tuna {
	private int sum;
	public final int NUMBER;
	
	public tuna(int x){
		NUMBER=x;
	}	
	public void add(){
		sum+=NUMBER;		
	}	
	public String toString(){
		return String.format("SUM=%d\n",sum);		
	}
}
