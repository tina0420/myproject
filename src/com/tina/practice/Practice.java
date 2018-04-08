package com.tina.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		for(int i = 1; i<=9; i++){
			for(int j = 2; j<=5; j++){
					System.out.print(j +" x " +i+ " = "+(j *i)+" \t");
				}                                             // \t是齊頭:tab鍵
				System.out.println();
			}
		
		System.out.println();
		
		int score = 95;
		int level = score/10;
		switch(level) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Failed");
				break;
			case 6:
				System.out.println("Pass");
				break;
			case 7:
				System.out.println("Good");
			    break;
			case 8:
				System.out.println("Great");
			    break;
			case 9:
				System.out.println("Excellent!");
				
				System.out.println();
				
				Scanner scanner = new Scanner(System.in);
				String line = scanner.nextLine();
				int n = Integer.parseInt(line);
				for (int i = 1; i<=n; i++) {
					if(i % 3 == 0) {
						System.out.print(i+"*");
						continue;
					}
					System.out.print(i +" ");
				}
				
				
		}
				
		
		
		
		
		
		}

	}

