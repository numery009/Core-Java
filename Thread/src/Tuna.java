import java.util.*;

//Runnable interface contains Run method
public class Tuna implements Runnable{
	String name;
	int time;
	Random r=new Random();
	
	public Tuna(String x){
		name=x;
		time=r.nextInt(999);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.printf("%s us sleeping for %d\n", name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
