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
	
	List<Course> courses = new ArrayList<>();
	public Main() {
		readcourses();
	}
	public void readcourses() {
		try {
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入星期(1~7)");
			int w = scanner.nextInt();
			System.out.println("請輸入時間(0~24)");
			int t = scanner.nextInt();
			for (int i=0; i<5; i++) {
				line = br.readLine();
			    String[] token = line.split(",");
			    String id = token[0];
			    String object = token[1];
			    int weekday = Integer.parseInt(token[2]);
			    int time = Integer.parseInt(token[3]);
			    int duration = Integer.parseInt(token[4]);
			    Course c = new Course(id, object, weekday, time, duration);
			    //且:&&  或:||
			    //&&只要前面為false，就不會繼續計算後面的
			    if(c.weekday==w) {
			    	if(c.time<=t && t<=(c.time+c.duration)) {
			    		System.out.println("[有課:"+"\t"+id+"\t"+object+"\t"+"到"+"\t"+(time+duration)+"時");
			            break;            
			    	}else {
			    	System.out.println("[有空堂]");
			    	break;
			    }
					
			    }else {
			    }
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
	}

}
