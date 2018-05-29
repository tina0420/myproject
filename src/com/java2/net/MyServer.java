package com.java2.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6666);
			Socket socket = server.accept();
			System.out.println("conneted");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader read = new BufferedReader(isr);
			String line = read.readLine();
			System.out.println(line);
			String tokens[] = line.split(":");
			String command = tokens[0];
			String option = tokens[1];
			System.out.println(command+"/"+option);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
