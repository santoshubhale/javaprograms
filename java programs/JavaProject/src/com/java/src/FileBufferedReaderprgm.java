package com.java.src;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileBufferedReaderprgm {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\Bablu\\Desktop\\santosh java\\abc6.txt");
		BufferedReader br = new BufferedReader(fr);

		String s = br.readLine();
		while(s!=null) {
		System.out.println(s);
		s=br.readLine();
		}
		br.close();
	}

}