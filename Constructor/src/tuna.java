
public class tuna {
	public String girlName;
	
	public tuna(){
		
	}
	public tuna(String Name){
		girlName=Name;
	}
	
	public void setName(String Name){
		girlName=Name;
	}	
	public String getName(){
		return girlName;
	}
	public void saying()
	{
		System.out.printf("Your first gf was %s",getName());
		System.out.println();
	}	
}
