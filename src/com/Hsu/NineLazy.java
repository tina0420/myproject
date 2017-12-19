package com.Hsu;

public class NineLazy {

	public static void main(String[] args) {
		for(int i = 1; i<=3; i++){
			for(int j = 2; j<=9; j++){
					System.out.print(j +" x " +i+ " = "+(j *i)+" \t");
				}                                             // \t是齊頭:tab鍵
				System.out.println();
			}
		
		System.out.println();
		for(int n=1; n<=5; n++){
			for(int k=1; k<=16; k++){
				System.out.print("..."+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int k=2; k<=9; k++){
			System.out.print(k +" x " +"9"+ " = "+(k *9)+" \t");
		}

	}

}
