package com.tina;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
        System.out.println("請輸入您的名字:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Hello," +line);
        
        System.out.println("你幾歲啊?");
        line = scanner.nextLine();
        int age = Integer.parseInt(line);
        System.out.println(age>25);
        
        int x = 5;
        int y = 8;
        int z = x%y;
        System.out.println(z);
        
        System.out.println(x == y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        
        System.out.println(x >> 1);
        x++;
        x--;
        System.out.println(x);
        

	}

}
