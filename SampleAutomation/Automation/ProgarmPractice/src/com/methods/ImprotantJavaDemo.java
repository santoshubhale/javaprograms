package com.methods;

class Santosh1 {
	int a = 10;
	static int b = 20;

}

class Santosh2 {
	Santosh2(int a) {
		int x = Santosh1.b;
		System.out.println("instance variable = "+x);
		Santosh1 s = new Santosh1();
		System.out.println("Static instance variable = "+s.a);
		System.out.println("i am no args method");
	}

}

public class ImprotantJavaDemo {

	public static void main(String[] args) {
		Santosh2 s = new Santosh2(10);
		
	}

}
