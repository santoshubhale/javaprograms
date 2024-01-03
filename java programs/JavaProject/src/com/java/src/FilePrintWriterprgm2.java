package com.java.src;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FilePrintWriterprgm2 {

	public static void main(String[] args) {
		test t = new test();
		t.m();

	}

}

class test {
	public void m() {
		PrintWriter pw =null;
		try {
			 pw = new PrintWriter("C:\\Users\\Bablu\\Desktop\\santosh java\\abc5.txt");
			 pw.println("java is a strong language");
			 pw.flush();
		} catch(FileNotFoundException f ) {
			System.out.println("Handled"+f);

		}finally {
			pw.close();
		}
	}
}