package com.sgtesting.assignmentday23;

abstract class Demo1 {
	void add(int a, int b) {
		System.out.println("Add Result:" + (a + b));
	}
}

class Demo2 extends Demo1 {

	void add(int a, int b) {
		System.out.println("Add Result:" + (a + b));
	}

	void sub(int x, int y) {
		System.out.println("Sub Result:" + (x - y));
	}
}

class Demo3 extends Demo2 {

	void sub(int x, int y) {
		System.out.println("Sub Result:" + (x - y));
	}

	void mul(int a, int b) {
		System.out.println("Mul Result:" + (a * b));
	}
}

class Demo4 extends Demo3 {
	void mul(int a, int b) {
		System.out.println("Mul Result:" + (a * b));

	}

}

public class Q4ExecuteAllMethod {

	public static void main(String[] args) {
		Demo4 o = new Demo4();
		o.add(10, 20);
		o.sub(90, 30);
		o.mul(10, 20);

	}

}
