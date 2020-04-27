package obj;

public class Kujichecker {
	int kingaku;
	
	void check(Kuji k) {
		if(k.bangou==123456) {
			k.kekka="番：1等";
			this.kingaku += 100000;
		}else if (k.bangou %100== 12){
			k.kekka="番：2等";
			this.kingaku += 1000;
		}else {
			k.kekka="番：はずれ";
			this.kingaku += 0;
		}
	}

}
