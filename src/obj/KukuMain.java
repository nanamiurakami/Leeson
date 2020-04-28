package obj;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {

		ArrayList<KukuMondai> kmlist = new ArrayList<KukuMondai>();
		
			kmlist.add( new KukuMondai() );
			kmlist.add( new KukuMondai() );
			kmlist.add( new KukuMondai() );
			kmlist.add( new KukuMondai() );
			kmlist.add( new KukuMondai() );

		for (KukuMondai km : kmlist) {
			km.show();
			int kotae = new java.util.Scanner(System.in).nextInt();
			km.check(kotae);
		}
	}
}
