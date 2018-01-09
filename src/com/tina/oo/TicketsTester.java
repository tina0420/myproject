package com.tina.oo;

import java.util.ArrayList;

public class TicketsTester {

	public static void main(String[] args) {
		//ArrayList tickets = new ArrayList();
		//tickets.add(new Tickets("2018.01.08","18:30","松山","八堵",65));
		Tickets t1 = new Tickets("2018.01.08","18:30","松山","八堵",65);
        t1.date="2018.01.08";
        t1.time="18:30";
        t1.start="松山";
        t1.arrive="八堵";
        t1.price=65;
		t1.print();
	}

}
