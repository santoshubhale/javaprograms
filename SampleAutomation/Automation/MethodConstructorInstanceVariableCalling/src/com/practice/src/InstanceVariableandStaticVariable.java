package com.practice.src;

class Demo1111 {
	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;
}

class Demo2 {
	Demo2() {
		Demo1111 d1 = new Demo1111();

		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(Demo1111.c);
		System.out.println(Demo1111.d);
	}
}

public class InstanceVariableandStaticVariable {

	public static void main(String[] args) {
		Demo2 dd = new Demo2();
	}

}
