package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		Drink a = new Drink(111,"a",10);
		Drink b = new Drink(222,"b",25);
		Drink c = new Drink(333,"c",30);
		FileReader fr = new FileReader(Drink.txt);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		
		
	}

}
