package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.ListView;

import com.tina.sogo.Customer;
import com.tina.sogo.GoldenCustomer;
import com.tina.sogo.SilverCustomer;

public class Sogo {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
	
	public void showFunction() {
		System.out.println("請輸入功能(123):");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程式");
	}
	
	public void start() {
		int function = 0;
		//showFunction();
		//int step = scanner.nextInt();
		while(function != 3) {
			showFunction();
			function = scanner.nextInt();
			switch(function) {
			case 1:
				inputSales();
			    break;
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while(line != null) {
						try {
							String[] token = line.split("\t");
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type, amount);
							list.add(sales);
						}catch(NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			for (Sales sales: list) {
				Customer customer = null;
				switch(sales.type) {
				case 1:
					customer = new Customer(sales.getAmount());
					break;
				case 2:
					customer = new SilverCustomer(sales.getAmount());
					break;
				case 3:
					customer = new GoldenCustomer(sales.getAmount());
					break;
				}
				customer.print();
			}
			break;
			
			case 3:
				return;
			}
		}
		
	}
	public void inputSales() {
		try {
			FileOutputStream fos = new FileOutputStream("sales.txt",true);
			PrintStream out = new PrintStream(fos);
			System.out.println("請輸入會員等級:");
            int type = scanner.nextInt();
            System.out.println("請輸入消費金額:");
            int amount = scanner.nextInt();
            out.println(type+"\t"+amount);
            out.flush();
            out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
