
public enum tuna {
	Numery("nice","29"),
	Nawmi("cutie","25"),
	Narmeen("sexy","27"),
	Heme("Bulky","18"),
	Lopa("Fit","25"),
	Silvy("Bulky","18"),
	Eti("Awaful","30");
	
	private final String desc;
	private final String year;
	
	tuna(String description,String birthday){
		desc=description;
		year=birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}
