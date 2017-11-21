package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int i = Integer.parseInt(line);
		int n = 1;
		while(n <= i){
			System.out.print(n +" ");
			n = n+ 1;
			if(n > 10){
				break;
			}
			
		}
		
		}
	

}
