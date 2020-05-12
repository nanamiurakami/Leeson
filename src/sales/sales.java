package sales;

public class sales {
	private String name;
	private int kingaku;


	public sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}


	public String getName() {
		return name;
	}


	public int getKingaku( ) {
		int getSouryou=500;
		if (kingaku>=3000) {
			int getSouryou2=0;
		}
		return kingaku;
	}


	void show() {
		System.out.println(this.name+" "+this.kingaku+getSouryou);
	}


}
