package com.sgtesting.exceptionhandling;

class Demo1 {
	void add(int a, int b) {

		int c = a + b;
		System.out.println("Add" + c);
	}

	void sub(int a, int b) {

		int c = a - b;
		System.out.println("Sub" + c);

	}

	void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println("div" + c);

		} catch (ArithmeticException e) {
			StackTraceElement eq;
			System.out.println(e);
			
		}
	}

	void mul(int a, int b) {
		int c = a * b;
		System.out.println("mul" + c);
	}
	void positive(int x) {
		if(x>0) {
		System.out.println(x+"is positive number");
		}else {
			System.out.println(x+"is negative number");
		}
	}

}

public class Program1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add(100, 20);
		d.sub(20, 10);
		d.div(100, 10);
		d.mul(10, 10);
		d.positive(11);

	}

}
