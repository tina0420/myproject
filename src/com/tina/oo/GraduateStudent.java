package com.tina.oo;

public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(){
		
	}
    @Override
	public void print(){
    	super.print();
    	System.out.println("pass");
		System.out.println(english+"\t"+
		                math+"\t"+chinese+thesis);
    }
    @Override
    protected int getAverage(){
		return (english+math+chinese)/3;
	}
}
