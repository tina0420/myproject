package com.tina.sogo;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		customers.add(new SilverCustomer(25000));
		customers.add(new GoldenCustomer(35000));
		for (int i=0; i<customers.size(); i++){
			Customer c = customers.get(i);
			c.print();
		}
		
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(123);
		//list.add(45);
		//list.add(783);
		//list.add(55);
		//int n = list.get(3);
		//System.out.println(list.get(1));
		//System.out.println(list.size());
		//for (int i=0; i<list.size(); i++){
		//	System.out.println(list.get(i));
		//}
				
		//c1.print();
		//SilverCustomer c2 = new SilverCustomer(1000);
		//c2.print();
	}

}
