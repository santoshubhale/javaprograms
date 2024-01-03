package com.java.src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionHandlingUsingThrow {
public static void method()throws FileNotFoundException{
	FileReader file = new FileReader("c:\\user\\santosh\\");
	BufferedReader fileinput = new BufferedReader(file);
	
		throw new FileNotFoundException();
}
	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Hi Banglore");
	}

}
