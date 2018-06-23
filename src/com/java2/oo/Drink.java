package com.java2.oo;

public class Drink {
	public static final String txt = null;
	int id;
	String name;
	int price;
	public Drink(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Drink() {
		//多寫一個空的建構子是為了滿足JavaBean 
		//JavaBean：一個空的建構子與getter setter 
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}

}
