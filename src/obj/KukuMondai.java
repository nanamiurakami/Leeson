package obj;

public class KukuMondai {
	int num1;
	int num2;
	
	public KukuMondai() {
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	}
	
	void show() {
		System.out.print(num1);
		System.out.print("×");
		System.out.print(num2);
		System.out.println("=");
	}
	
	void check (int kotae) {
		if ((num1 * num2) == (kotae))
			System.out.println("正解◎");
		if ((num1 * num2) != (kotae))
			System.out.println("不正解×"+"正解は"+ (num1*num2) );
	}

}
