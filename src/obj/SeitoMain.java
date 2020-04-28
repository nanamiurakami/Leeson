package obj;

import java.util.ArrayList;

public class SeitoMain {
	public static void main(String[] args) {
		
		ArrayList<Chugakusei> clist = new ArrayList<Chugakusei>();
		clist.add (new Chugakusei ("田中", 80 , 70 , 90 , 80) ) ;
		clist.add (new Chugakusei ("佐藤", 50 , 80 , 70 , 40) );
		clist.add (new Chugakusei("太田", 90 , 50 , 50 , 60) );
		
		int sum=0;
		
		for (Chugakusei c : clist) {
			c.show();
			
			sum+=c.goukei();
		}
		System.out.println("全員の"+ sum + "点");

//		Seito s1 = new Seito ();
//		s1.name = "田中";
//		s1.kokugo = 80 ;
//		s1.sansu = 70 ;
//		s1.syakai = 50 ;
//
//		s1.show();
	}
}
