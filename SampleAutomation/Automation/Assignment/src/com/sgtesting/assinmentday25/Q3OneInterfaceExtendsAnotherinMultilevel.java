package com.sgtesting.assinmentday25;

interface A {
	void display();
}

interface B extends A {
	void show();
}

interface C extends B {
	void demo();
}

class Sample implements C {

	public void display() {
		System.out.println("I am A's method");

	}

	public void show() {
		System.out.println("I am B's method");

	}

	public void demo() {
		System.out.println("I am c's method");

	}

}

public class Q3OneInterfaceExtendsAnotherinMultilevel {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.display();
		s.show();
		s.demo();
		

	}

}
