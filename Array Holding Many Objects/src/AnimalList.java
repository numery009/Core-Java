
public class AnimalList {
	private Animal[] theList=new Animal[5];
	private int i=0;
	public void add(Animal A){
		if(i<theList.length){
			theList[i]=A;
			System.out.println("Animal Added at Index "+i);
			i++;
		}
	}
}
