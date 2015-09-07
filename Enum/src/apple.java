import java.util.EnumSet;


public class apple {
	public static void main(String aargs[]){
		for(tuna people: tuna.values())
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
			
			System.out.println("\nAnd for the rnge of constrnats!!!\n");
			
		for(tuna people: EnumSet.range(tuna.Nawmi, tuna.Silvy))
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear());
	}
}
