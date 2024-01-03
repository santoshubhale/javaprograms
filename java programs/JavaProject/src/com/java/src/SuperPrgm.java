package com.java.src;

public class SuperPrgm {

	String color = "White";
}

class Superprgm1 extends SuperPrgm {

	String color = "Black";

	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

class Test {
	public static void main(String[] args) {
		Superprgm1 sp = new Superprgm1();
		sp.printcolor();

	}

}
// o/p :-Black
//White

