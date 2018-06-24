package com.java2.schedule;

import java.io.FileOutputStream;
import java.io.InputStream;

public class Course {
	String id;
	String object;
	int weekday;
	int time;
	int duration;

	public Course(String id, String object, int weekday, int time, int duration) {
	this.id=id;
	this.object=object;
	this.time=time;
	this.duration=duration;
}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	

}
