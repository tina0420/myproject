package com.java2.io;

import java.io.PrintStream;

public class SimpleWriteTester {

	public static void main(String[] args) throws FileNotFoundException{
		PrintStream out = new PrintStream(data.txt);
		out.println("Tina\t406570235\t19990420");
		out.flush();
		out.close();
		

	}

}
