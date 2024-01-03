package com.java.src;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileBufferedWriterPrgm {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\Bablu\\Desktop\\santosh java\\abc3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(231);
		bw.newLine();
		bw.write("java is object oriented language");
		bw.flush();
		bw.close();

	}

}
