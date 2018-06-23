package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
			try {
				FileReader fr = new FileReader("vending.txt");
				BufferedReader buf = new BufferedReader(fr);
				String line = buf.readLine();
				
			    String[] token = line.split(",");
				//int count = Integer.parseInt(token[0]);
				for (int i=0; i<3; i++) {
					String name = token[i*2]; 
				    int price = Integer.parseInt(token[i*2+1]) ;
				    vm.drinks.add(new Drink(i,name,price));
				    
				}
				vm.on();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	
	}
}
