package com.java.src;

interface interfacePrintableprgm {
	void print();

}

interface interfaceShowablePrgm {
	void show();
}

class A7 implements interfacePrintableprgm, interfaceShowablePrgm {

	@Override
	public void show() {
		System.out.println("I am Show");

	}

	@Override
	public void print() {
		System.out.println("I am print");

	}

	public static void main(String[] args) {
		A7 a = new A7();
		a.show();
		a.print();

	}
}