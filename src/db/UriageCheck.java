package db;

import java.util.ArrayList;

public class UriageCheck extends Shouhin {

	public static void main(String[] args) {

		ShouhinDAO dao = new ShouhinDAO();
		ArrayList<Shouhin> list = dao.findAll();
		for(Shouhin s : list) {
		System.out.println(s.getSid() + ":" + s.getSname());
		}

		System.out.println("どの売り上げを見たいですか？");
		int sid = new java.util.Scanner(System.in).nextInt();

		UriageDAO udao = new UriageDAO();

		ArrayList<Uriage>ulist = udao.findBySid(sid);
		for(Uriage u : ulist) {
			System.out.println(u.getHi() + " " + u.getKosu() + "個");
		}
	}

}
