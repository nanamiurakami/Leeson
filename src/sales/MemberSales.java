package sales;

public class MemberSales extends sales{
	private String name;
	private int kingaku;


	public MemberSales(String name, int kingaku, String name2, int kingaku2) {
		super(name, kingaku);
		name = name2;
		kingaku = kingaku2;
	}


	public String getName() {
		return name;
	}


	public int getKingaku() {
		return kingaku;
	}



}
