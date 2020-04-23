
public class Coin {

	public static void main(String[] args) {
		
		int[] coins = {500,100,50,10,5,1};
		int sum=0;
		//500円玉は何枚？1
		//100円玉は何枚？2
		//50円玉は何枚？0
		//10円玉は何枚？4
		//5円玉は何枚？0
		//1円玉は何枚？2
		
		for (int n :coins) {
			System.out.println(n);
		}
		for (int n :coins) {
			System.out.println(n + "円玉は何枚?");
			int maisu =new java.util.Scanner(System.in).nextInt();
			sum +=n*maisu;
		}
		System.out.println(sum+"円");
			
		
	}

}
