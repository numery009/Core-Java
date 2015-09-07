
public class BlueBerry {
	public static void main(String args[]){
		int[] numery={10,20,30,40,50};
		change(numery);
		
		for(int y:numery){
			System.out.println(y);
		}
	}
	public static void change(int[] x){
		for(int counter=0;counter<x.length;counter++){
			x[counter]+=5;
		}		
	}
}
