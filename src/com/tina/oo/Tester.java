package com.tina.oo;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student("王小明",55,66,77);
		Student stu2 = new Student("王大為",55,66,77);
		//Student stu = new Student("王小明");
		//stu.english = 66;
		//stu.math = 77;
		//stu.chinese = 88;
	    //stu.print();
		// System.out.println(stu.name+ avg);
		stu1.pass =50;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println(stu1.name+":"+avg);
		Student.method();
	GraduateStudent gra = new GraduateStudent();
	gra.print();
	}

}
