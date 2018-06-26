package com.java2.mazegame;

public class Maze {
	int lang;
	int width;
	int trouble;
	int[] location;
	int hp;
	
	public Maze(int lang, int width, int trouble) {
		this.lang = lang;
		this.width = width;
		this.trouble = trouble;
	}
    
	public void setLocation(int[] location) {
	
		this.location = location;
	}
	
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getTrouble() {
		return trouble;
	}
	public void setTrouble(int trouble) {
		this.trouble = trouble;
	}
	public int[] getLocation() {
		return location;
	}
	

}
