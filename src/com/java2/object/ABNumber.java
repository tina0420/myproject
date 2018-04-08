package com.java2.object;

public class ABNumber {
	String number;
	public ABNumber(String number) {
		this.number=number;
	}
	public int validate(String secrect) {
		int result = 0;
		int length = secrect.length();
		for (int i=0; i<number.length(); i++) {
			char c = number.charAt(i);
			for (int j=0; j<length; j++) {
				if(c == secrect.charAt(j)) {
					if(i == j) {
						result = result+10;
					} else {
						result = result+1;
					}
					break;
				}
			}
			
		}
		return result;
	}

}
