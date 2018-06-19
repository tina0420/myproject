package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total=0;
	List<Drink> drinks = new ArrayList<>();
	public void on(){
		System.out.println("請投入硬幣");
		for(int i = 0; i < drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		int total = 0;
		while(choice != 0 ){
			System.out.println("餘額"+ total +"元");
			System.out.println("請投幣(限5,10,50元)或點選飲料(a,b,c)");

		}
		
	
	}

}
