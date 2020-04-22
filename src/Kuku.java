
public class Kuku {

	public static void main(String[] args) {
		
		System.out.println("九九を入力");
		
		int kuku1 =new java.util.Random().nextInt(9)+1;
		System.out.print(kuku1);
		
		System.out.print("×");
		
		int kuku2 =new java.util.Random().nextInt(9)+1;
		System.out.print(kuku2);
		
		System.out.println("=");
		
		int youanser= new java.util.Scanner(System.in) .nextInt();
		
		if ((kuku1*kuku2) ==(youanser))
			System.out.println("正解");
		
		if ((kuku1*kuku2) !=(youanser))
		    System.out.println("不正解");
		
				}

}
