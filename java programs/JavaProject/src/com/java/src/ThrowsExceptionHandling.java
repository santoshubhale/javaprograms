package com.java.src;

import java.io.IOException;

public class ThrowsExceptionHandling {
	
	void m()throws IOException{
		throw new IOException("Device error");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
		n();
		}catch (Exception e) {
			System.out.println("hi i am printing");
		}
	}

	public static void main(String[] args) {
	 ThrowsExceptionHandling teh = new ThrowsExceptionHandling();
	 teh.p();
	 System.out.println("Namskar");

	}

}
