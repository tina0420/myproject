package com.tina;

public class Prime {

	public static void main(String[] args) {
		int n = 233;
		boolean prime = true;
		for (int i=2; i<n; i++){
			if(n % i == 0){
				//不是質數
				prime = false;
				break;
			}
		}
		if (prime){
			System.out.println(n + " IS PRIME NUMBER!");
		}else {
			System.out.println(n + " IS NOT PRIME NUMBER!");
		}

	}

}
