package com.java.src;

public class methodOverridding {

	void bike() {
		System.out.println("bike is Running");
	}
}
	class methodOverridding2 extends methodOverridding{
		
	void bike() {
		System.out.println("bike 2 is running");
	}
	public static void main(String[] args) {
		methodOverridding2 mo = new methodOverridding2();
		mo.bike();
	}

}
