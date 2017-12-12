package com.tina.oo;

public class Student {
	int chinese;
	int english;
	int math;
	String name;
	
 	//public Student(String n,int e, int m, int c){
	//name = n ;
	//english = e;
	//math = m;
	//chinese = c;
	public Student(String name,int english, int math, int chinese){
 		this.name = name;
 		this.english = english;
 		this.math = math;
 		this.chinese = chinese;
 	}
	public Student(String n){
		this.name = n;
	}
 	public void print(){
		System.out.println(english+"\t"+
	                math+"\t"+chinese);
	}
 	
 	public int getAverage(){
		return (english+math+chinese)/3;
	}

}
