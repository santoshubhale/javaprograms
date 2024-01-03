package com.practice.src;

class X {
	int aa = 120;
	static String s = "Welcom";

	X() {
		System.out.println("i m X class Constructor");
		Y.show();
	}

}

class Y {
	static void show() {
		System.out.println(X.s);
		Z ac = new Z();
		ac.dis(10);

	}

}

class Z {
	void dis(int xx) {
		System.out.println("I am z method");
		
	}

}

public class ThreeClassConstrutorAndStaticMethod {

	public static void main(String[] args) {
		X nn = new X();

	}

}
