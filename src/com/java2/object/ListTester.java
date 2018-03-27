package com.java2.object;

import java.util.List;
import java.util.ArrayList;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(4);
		cards.add(2);
		cards.add(1);
		cards.add(18);
		cards.set(1, 99);  //把1位子上的字換成99
		
		System.out.println(cards.size());
		System.out.println(cards.get(1));
		System.out.println("removing number:" +cards.remove(0));

	}

}
