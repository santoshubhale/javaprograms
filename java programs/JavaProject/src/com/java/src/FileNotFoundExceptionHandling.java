package com.java.src;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class FileNotFoundExceptionHandling {

	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt");
			pw.println("saved");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			 e.printStackTrace();
		}

		System.out.println("file save successfully");

	}

}
