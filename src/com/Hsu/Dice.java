package com.Hsu;

public class Dice {

	public static void main(String[] args) {
		for(int a=1; a<=10; a++){
		int i ;
		i = (int)(Math.random()*6)+1;
		System.out.print(i);
		System.out.print(" ");
		int j ;
		j = (int)(Math.random()*6)+1;
		System.out.print(j);
		System.out.print(" ");
		int k ;
		k = (int)(Math.random()*6)+1;
		System.out.print(k);
		System.out.print(" ");
		int n ;
		n = (int)(Math.random()*6)+1;
		System.out.print(n);
		if(i==j || i==k || i==n || j==k || j==n || k==n){
			System.out.print(" ");
		}else{
			System.out.print("*");
		}
		System.out.println();
		
		}
	}
}
