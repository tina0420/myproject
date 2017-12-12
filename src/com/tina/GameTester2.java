package com.tina;

import java.util.Scanner;

public class GameTester2 {

	public static void main(String[] args) {
		int hp = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		System.out.println(hp);
		Scanner scanner = new Scanner(System.in);
		
		while(hp != 0){
			String line = scanner.nextLine();
			int m = Integer.parseInt(line);
			switch(m){
			//下
			case 2:
			if(pos/col <row-1){
			pos = pos+col;
			hp = hp-5;
			System.out.println(pos+" "+hp);
			break;
			}else{
				pos = pos;
				hp = hp-5;
				System.out.println(pos+" "+hp);
				break;
			}
			//上
			case 8:
			if(pos /col>=1){
			pos = pos-col;
			hp = hp-5;
			System.out.println(pos+" "+hp);
			break;
			}else{
				pos = pos;
				hp = hp-5;
				System.out.println(pos+" "+hp);
				break;
			}
			//左
			case 4:
			if(pos%col != 0){
			pos = pos-1;
			hp = hp-5;
			System.out.println(pos+" "+hp);
			break;
			}else{
				pos = pos;
				hp =hp -5;
				System.out.println(pos+" "+hp);
				break;
			}
			//右
			case 6:
			if(pos%col != col-1){
			pos = pos+1;
			hp = hp-5;
			System.out.println(pos+" "+hp);
			break;
			}else{
				pos = pos;
				hp =hp -5;
				System.out.println(pos+" "+hp);
				break;
			}
				
		}
		
		}
		}
	}


