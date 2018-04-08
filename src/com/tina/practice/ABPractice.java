package com.tina.practice;

import java.util.Scanner;

public class ABPractice {

	public static void main(String[] args) {
		String secrect = "2893";
		int a=0;
		int b=0;
		Scanner scanner = new Scanner(System.in);
		while(a != 4) {
			System.out.println("Please enter your guess:");
			String numbers = scanner.nextLine();
			int length = secrect.length();
			for (int i=0; i<numbers.length(); i++) {
				char n = numbers.charAt(i);
				for (int j=0; j<length; j++) {
					if(n == secrect.charAt(j)) {
					if(i == j) {
						a++;
  					} else {
  						b++;
  					} 
					break;
					}
				}
			}
			System.out.println(a+"A"+b+"B");
		} 
	}
}
