package com.java.src;

import java.io.IOException;

public class ExceptionPropogation2 {

	void m() {
		throw new java.io.IOException("Device error");
		
	}

	void n() {
		m();
	}

	void p() {
		 try {
		n();
		 }catch (Exception e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}

	public static void main(String[] args) {

		ExceptionPropogation2 ep1 = new ExceptionPropogation2();
		ep1.p();

		System.out.println("Normal flow");
	}

}


