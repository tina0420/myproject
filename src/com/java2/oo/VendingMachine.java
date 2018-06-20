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
		int total = 0;
		while(true){
			System.out.println("餘額"+ total +"元");
			System.out.println("請投幣(限5,10,50元)或點選飲料(a,b,c)");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine();
		if (choice != "0") {
			switch(choice) {
			case "a":
				if (total >= 10) {
					Drink drink = drinks.get(0);
					System.out.println("購買a"+"\t"+drink.getPrice()+"元");
					total=total-10;
					break;
				}else {
					System.out.println("餘額不足");
					break;
				}
			case "b":
				if (total >= 25) {
					Drink drink = drinks.get(1);
					System.out.println("購買a"+"\t"+drink.getPrice()+"元");
					total=total-25;
					break;
				}else {
					System.out.println("餘額不足");
					break;
				}
			case "c":
				if (total >= 30) {
					Drink drink = drinks.get(2);
					System.out.println("購買a"+"\t"+drink.getPrice()+"元");
					total=total-30;
					break;
				}else {
					System.out.println("餘額不足");
					break;
				}
			case "1":
				total = total+1;
				System.out.println("餘額:"+total);
				break;
			case "5":
				total = total+5;
				System.out.println("餘額:"+total);
				break;
			case "10":
				total = total+10;
				System.out.println("餘額:"+total);
				break;
			default :
				System.out.println("輸入錯誤!!");
				break;
			}
		}else {
			System.out.println("結束Vending");
		}
			
		}
		
	
	}

}
