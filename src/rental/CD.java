package rental;

public class CD extends Item{

	public CD(String name, int days) {
		super(name, days);
	}

	public int getPrice() {
		return ((this.days-1)*100)+300;
	}

}
