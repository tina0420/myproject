package com.tina.oo;

public class Tester {

	public static void main(String[] args) {
		//Student stu = new Student("王小明",55,66,77);
		Student stu = new Student("王小明");
		//stu.english = 66;
		//stu.math = 77;
		//stu.chinese = 88;
	    stu.print();
	    int avg = stu.getAverage();
	    System.out.println(stu.name+ avg);

	}

}
