
public class IfSample {

	public static void main(String[] args) {
		//入力した文字列がabcなら「当たり」
		//そうでないなら「はずれ」と表示
		System.out.println("点数を入力");
		int num= new java.util.Scanner(System.in).nextInt();
		//80点以上なら評価A、60点以上は評価B、59点以下なら評価C
		if ( num >= 80 ) {
			System.out.println("評価A");
		}else if( 60 <= num) {
			System.out.println("評価B");
	    }else  {
			System.out.println("評価C");
		}
	    

	}

}
