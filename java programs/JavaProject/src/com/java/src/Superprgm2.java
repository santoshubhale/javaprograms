package com.java.src;

public class Superprgm2 {

	Superprgm2() {
		System.out.println("Program is created");

	}
}
	class Superprgm3 extends Superprgm2 {
		Superprgm3() {
			super();
			System.out.println("program 2 created");
		}
	}

	class testprgm{
	public static void main(String[] args) {
		Superprgm3 sp = new Superprgm3();
		

	}

}
