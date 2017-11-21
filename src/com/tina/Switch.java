package com.tina;

public class Switch {

	public static void main(String[] args) {
		for(int i=1; i<=13; i++){
			if (i % 3 == 0){
				continue;
			}
			System.out.print(i+ " ");
		}
       System.out.println();
		for(int n = 0; n<=21; n++){
    	   if (n % 2== 0){
    		   continue;
    	   }System.out.print(n+" ");
       }
	
	}

}
