package com.tina.oo;

public class Student {
	protected int chinese;
	protected int english;
    int math;
	String name;
	static int pass=60;
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
		System.out.println("pass");
		System.out.println(english+"\t"+
		                math+"\t"+chinese);
	}
 	
 	 int getAverage(){
		return (english+math+chinese)/3;
	}
 	public static void method(){
 		System.out.println("Hello!");
 	}
 	
 	public Student(){
 		//空建構值
 	}
 		

}
