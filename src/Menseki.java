
public class Menseki {

	public static void main(String[] args) {
		
		//半径10の円の面積
		enMenseki(10);
		
		//2.半径1から5の円の面積を表示（for）
		
		for (int i = 1; i <= 5; i++) {
			enMenseki(i);
		}
		
		//3.半径3 8 20 の円の面積を表示（配列）
		
		int [] mensekis= {3,8,20};
		for (int m :mensekis) {
			enMenseki(m);
		}

	}
	//1.メソッド enMensekiを作る
	    //引数 int hankei
		//hankei*hankei*3.14 を表示
		
	public static void enMenseki(int hankei) {
		System.out.println(hankei*hankei*3.14);
	}
	

	
}
