package com.java2.oo;

public class Token {

	public static void main(String[] args) {
		String line = "eating,eating,eating";
		String[] tokens = line.split(",");
		for (String token : tokens) {
			System.out.println(token);
		}
	}

}
