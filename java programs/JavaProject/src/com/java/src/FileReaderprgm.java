package com.java.src;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderprgm {

	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\Bablu\\Desktop\\santosh java\\abc5.txt");
		int i = f.read();
		while(i!=-1) {
		System.out.print((char)(i));
		i =f.read();
		
		}
	}

}
