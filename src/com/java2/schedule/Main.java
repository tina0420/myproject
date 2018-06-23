package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*有一文字檔儲存了課表資訊(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入(1-7):2
 * 請輸入時間(0-24):11
 * [有空檔]
 * 請輸入星期(1-7):4
 * 請輸入時間(0-24):14
 * [有課: C004 Engiish 到16時]
 */
public class Main {
	
	public static void main(String[] args) {
		List<Course> courses = new ArrayList<>();
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
