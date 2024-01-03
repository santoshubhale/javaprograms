package com.java.src;

public class MethodOverlodingprgm {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {

		return a + b + c;

	}
}
class Methodtest{
	
	public static void main(String[] args) {
		
		MethodOverlodingprgm mo = new MethodOverlodingprgm();
		int x= mo.add(12, 10);
		int y= mo.add(10, 20, 30);
		System.out.println(x);
		System.out.println(y);

	}

}
