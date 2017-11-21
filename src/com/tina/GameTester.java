package com.tina;


import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		System.out.println("請輸入一個方向:");
		Scanner scanner = new Scanner(System.in);
		while(true){
		String line = scanner.nextLine();
		int i =Integer.parseInt(line);
		switch(i){
		case 4:
			System.out.println("向左");
			break;
		case 2:
			System.out.println("向下");
			break;
		case 6:
			System.out.println("向右");
			break;
		case 8:
			System.out.println("向上");
			break;
		}if(i == 0){
			System.out.println("Bye!");
			break;
		}
		}
		}
	}


