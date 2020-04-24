
public class Gengou {

	public static void main(String[] args) {
		System.out.println("1:昭和 2:平成 3:令和");
		int gengou =new java.util.Scanner(System.in).nextInt();
		System.out.println("年を入力");
		int nen =new java.util.Scanner(System.in).nextInt();
		int seireki = getSeireki(gengou,nen);
		String gengo = getGengouName(gengou);
		System.out.println(gengo+nen+"年は西暦"+seireki+"年");
		
		//1:昭和 2:平成 3:令和
		//2
		//年を入力
		//30
		//平成30年は西暦2018年

	}
	public static int getSeireki(int gengou,int nen) {
		if ( gengou ==3) {
			return 2018+nen;
		}
		if ( gengou ==2) {
			return 1988+nen;
		}
		if ( gengou ==1) {
			return 1925+nen;
		}
		return 0;
		
	}
	
	public static String getGengouName(int gengou) {
		
		if (gengou==1) {
			return "昭和";
		}else if (gengou==2) {
			return"平成";
		}else if (gengou==3) {
			return"令和";
		}else {
			return"エラー";
		}
		
		
		
		
	}
}



