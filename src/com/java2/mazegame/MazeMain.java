package com.java2.mazegame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//有一遊戲場地，長寬由執行當時決定，場地中亂數產生
//陷阱，陷阱數也由當時決定
//有一個玩家在這場地中，初始HP值為100，走一步消
//耗1HP，撞到邊界扣5HP，掉到陷阱裡扣20HP
//有個當案(maze.txt)資訊如下:
//	6,4
//	5
//	6,8,2,4,2,2,6,6,8,4,2,2,6
public class MazeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				FileReader fr = new FileReader("maze.txt");
				BufferedReader br = new BufferedReader(fr);
				String line=br.readLine();
				String[] token = line.split(",");
				int lang = Integer.parseInt(token[0]);
				System.out.println(token[0]);
				int width = Integer.parseInt(token[1]);
				System.out.println(token[1]);
				
				line = br.readLine();
				int trouble = Integer.parseInt(line);
				Maze m = new Maze(lang, width, trouble);
			    Random random = new Random();
			    Set<String> set = new TreeSet<>();
			    While (set.size() < trouble) {
			    	String trap = String.valueOf(random.nextInt(24));
			    	set.add(trap);
			    }
			
			Scanner scanner = new Scanner(System.in);
	
			int walk = scanner.nextInt();
			int hp=100;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
