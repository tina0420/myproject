package com.tina.practice;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Drinks a = new Drinks("a飲料",15);
		Drinks b = new Drinks("b飲料",20);
		Drinks c = new Drinks("c飲料",30);
    int money =0;
	Scanner scanner = new Scanner(System.in);
    System.out.println("使用鍵盤輸入投幣金額, 只能輸入1,5,10元的硬幣");
    System.out.println("販賣機餘額:"+money+"元");
    while(true) {
    	String choice = scanner.nextLine();	 
        if(choice !="0") {
    	switch(choice) {
             case "1":
             	money=money+1;
             	System.out.println("販賣機餘額:"+money+"元");
             	System.out.println("請投幣或選擇飲料(a,b,c)或輸入0結束");
             	break;
             case "5":
             	money=money+5;
             	System.out.println("販賣機餘額:"+money+"元");
             	System.out.println("請投幣或選擇飲料(a,b,c)或輸入0結束");
             	break;
             case "10":
              	money=money+10;
         	    System.out.println("販賣機餘額:"+money+"元");
             	System.out.println("請投幣或選擇飲料(a,b,c)或輸入0結束");
         	    break;
             case "a":
            	 if(money<15) {
            		 money=money;
            		 System.out.println("BEEP!");
            		 System.out.println("販賣機餘額:"+money+"元");
            		 break;
            	 }else {
            		 money=money-15;
                	 System.out.println("Don!");
                	 System.out.println("販賣機餘額:"+money+"元");
                	 break;
            	 }
             case "b":
            	 if(money<20) {
            		money=money;
            		 System.out.println("BEEP!");
            		 System.out.println("販賣機餘額:"+money+"元");
            		 break;
            	 }else {
            		 money=money-20;
                	 System.out.println("Don!");
                	 System.out.println("販賣機餘額:"+money+"元");
                	 break;
            	 }
             case "c":
            	 if(money<30) {
            		 money=money;
            		 System.out.println("BEEP!");
            		 break;
            	 }else {
            		 money=money-30;
                	 System.out.println("Don!");
                	 System.out.println("販賣機餘額:"+money+"元");
                	 break;	 
            	 }
        }
        }
        
       
    
    
    }
   
    
    

	}

}
