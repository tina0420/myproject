package com.java2.schedule;

import java.io.FileOutputStream;
import java.io.InputStream;

public class Course {
	int dayoftheweek;
	int time;
	String object;
	Course schedrle = new Course();
	public void myschedule(int week, int time, String object ){
		this.dayoftheweek = week;
		this.time = time;
		this.object = object;
	}
	public  void InputObject(){
		FileOutputStream fos = new FileOutputStream(schedule.txt, true);
		
	}

}
