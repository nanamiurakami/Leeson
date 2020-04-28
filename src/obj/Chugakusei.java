package obj;

public class Chugakusei extends Seito{
	int eigo;

	public Chugakusei(String name, int kokugo, int sansu, int syakai, int eigo) {
		super(name, kokugo, sansu, syakai);
		this.eigo = eigo;
	}

	int goukei() {
		return super.goukei()+this.eigo;
	}

}
