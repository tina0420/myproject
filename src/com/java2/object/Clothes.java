package com.java2.object;

public class Clothes {
	String shirt;
	String dress;
	String pants;
	String coat;
	String shoes;
	String store;
	int quantity;
	private Clothes(String store,String shirt,String dress,String pants,String coat,String shoes,int quantity){
		this.shirt = shirt;
		this.dress = dress;
		this.pants = pants;
		this.coat = coat;
		this.shoes = shoes;
		this.store = store;
		this.quantity = quantity;
	}
	public void print(){
		System.out.println(quantity);
	}

}
