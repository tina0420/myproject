package com.java2.object;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Poker2 {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
	//	cards.size();
		for (int i = 1; i<53; i++){
			cards.add(i);
			System.out.println(cards.get(i-1));
		}
	}

}
