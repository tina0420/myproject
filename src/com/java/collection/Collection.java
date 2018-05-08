package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(7);
		System.out.println(list);
		
		//HashSet不會執行重複的東西EX:下面的1
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(5);
		set.add(3);
		set.add(1);
		System.out.println(set);
		
		//Map
		Map<String,String> stocks = new TreeMap<>();
		stocks.put("1234 "," 鴻海");
		stocks.put("5678 "," 台積電");
		stocks.put("9012 "," 聯發科");
		System.out.println(stocks);

	}

}
