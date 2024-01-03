package com.java.src;

import java.io.IOException;

public class Throws2 {

	public static void main(String[] args) throws IOException {
		try {
			Throws1 t = new Throws1();
			t.method();
		}catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("normal flow");
	}

}
