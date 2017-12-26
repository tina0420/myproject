package com.tina.oo;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Drink[] drinks = new Drink[3];
		drinks[0] = new Drink("a",15);
		drinks[1] = new Drink("b",20);
		drinks[2] = new Drink("c",30);
		System.out.println("投幣金額只能輸入1元、5元、10元");
		int money = 0;
		System.out.println("販賣機餘額:"+money);
		while(true){
		String line = scanner.nextLine();
		int i = Integer.parseInt(line);
        System.out.println("請投幣或選擇飲料(a,b,c)或輸入0結束");
		switch(i){
        case 1:
        System.out.println("販賣機餘額:"+(money+1));
        money = money+1;
        break;
        case 5:
        System.out.println("販賣機餘額:"+(money+5));
        money = money+5;
        break;
        case 10:	
        System.out.println("販賣機餘額:"+(money+10));
        money = money+10;
        break;
        }
		}
	}

}
