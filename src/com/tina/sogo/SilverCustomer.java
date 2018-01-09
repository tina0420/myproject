package com.tina.sogo;

public class SilverCustomer extends Customer{
	
	public SilverCustomer(int amount){
		super(amount);
		super.discount=0.1f;
	}
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println(amount+"\t"+total);
	}
}
