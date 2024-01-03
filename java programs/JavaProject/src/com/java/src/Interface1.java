package com.java.src;

public interface Interface1 {
	void draw();
}

interface interface2 extends Interface1 {
	void show();
}

class Testint implements interface2 {
	@Override
	public void draw() {
		System.out.println("I am draw....!");
	}

	@Override
	public void show() {
		System.out.println("I am Show......!");

	}
	public static void main(String[] args) {
		Testint ti = new Testint();
		ti.show();
		ti.draw();
	}
}