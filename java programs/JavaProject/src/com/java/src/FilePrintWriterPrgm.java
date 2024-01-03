package com.java.src;

import java.io.PrintWriter;

public class FilePrintWriterPrgm {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("C:\\Users\\Bablu\\Desktop\\santosh java\\abc4.txt");
		pw.println("java is plateform indipendent");
		pw.println("java is robust");
		
		pw.flush();
		pw.close();
	}

}
