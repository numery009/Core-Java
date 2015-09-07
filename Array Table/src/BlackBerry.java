public class BlackBerry {
	public static void main(String args[]){
		int SUM=0;
		System.out.println("Index\tValue");
		int numery[]={10,20,30,40,50};
		
		for (int counter=0;counter<numery.length;counter++){
			System.out.println(counter+ "\t" + numery[counter]);
			SUM+=numery[counter];			
		}
		System.out.println(SUM);
	}
}
