package sales;

import java.util.ArrayList;

public class SalesMain {

	public static void main(String[] args) {
		sales s = new sales();

		ArrayList<sales>list = new ArrayList<sales>();
		list.add(new sales());
		list.add(new MemberSales());

		s.show();
		System.out.println("通常顧客 名前:"s.getName()+"購入金額"+s.getKingaku()+"円");
		System.out.println("通常顧客 名前:"s.getName()+"購入金額"+s.getKingaku()+"円");
		System.out.println("会員顧客 名前:"s.getName()+"購入金額"+s.getKingaku()+"円");
	}

}
