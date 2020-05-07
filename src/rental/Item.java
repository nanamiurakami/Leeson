package rental;

public abstract class Item {
	String name;
	int days;

	public abstract int getPrice();

	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	@Override
	public String toString() {
		return "借りたもの :" + this.name + ", 日数 :" + this.days +"日" + ", 料金 :" +this.getPrice()+"円";
	}



}
