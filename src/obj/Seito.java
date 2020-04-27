package obj;

public class Seito {
	String name;
	int kokugo;
	int sansu;
	int syakai;
	
	void show () {
		System.out.println(this.name +""+ this.kokugo +"点" + this.sansu +"点" + this.syakai +"点");
		System.out.println(this.goukei()+"点");
		System.out.println(this.heikin()+"点");
	}
	int goukei() {
		return (kokugo+sansu+syakai);
		
	}
	double heikin() {
		return goukei()/3.0;
	}
}
