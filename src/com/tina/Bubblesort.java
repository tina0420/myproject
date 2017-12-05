package com.tina;

public class Bubblesort {

	public static void main(String[] args) {
		int n[]={51,23,6,65,15};
		//       0  1  2 3  4
		for (int i=0; i<n.length-1; i++ ){
			for (int j = i+1; j<n.length; j++){
			if(n[i]>n[j]){
				int tmp = n[i];
				n[i] = n[j];
				n[j] = tmp;
			}
			}
		}
		for (int number : n){
			System.out.print(number + " ");
		}
		
		

	}

}
