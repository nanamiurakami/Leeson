package Jinrou;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {

	ArrayList<Sankasha> slist = new ArrayList<Sankasha>();
	
	private String name;
	private Date hi;

	public Event(String name) {
		this.name = name;
		this.hi = new Date();
	}
	
	void add(Sankasha s) {
		this.slist.add(s);
	}

	void show() {
		System.out.println(name);
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(this.hi));
		
		for (Sankasha s : slist) {
			System.out.println(s.getName()+s.getAge());
		}
	}
	
}
