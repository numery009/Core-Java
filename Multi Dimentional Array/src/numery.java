
public class numery {
	public static void main(String[] args){
		int[][] firstnumber= {{1,2,3,4},{5,6,7,8}};
		int secondnumber[][]= {{9,10,11,12},{13,14,15,16}};
		Dispaly(firstnumber);
		Dispaly(secondnumber);
	}
	
	public static void Dispaly(int x[][]){
		for(int row=0;row<=x.length-1;row++){
			for(int column=0;column<=x[row].length-1;column++){
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
}

