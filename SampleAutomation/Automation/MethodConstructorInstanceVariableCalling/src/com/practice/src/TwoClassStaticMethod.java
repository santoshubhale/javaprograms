package com.practice.src;

class A {
	int a = 11;
	String b = "hello";
	static char ch = 's';
	

	int Demo(int x) {
		System.out.println(x);
		System.out.println(ch);
		return x;
	}
}

class B {
	static String show(String s) {
		System.out.println(s);
		System.out.println(A.ch);
		A x = new A();
		System.out.println(x.b);
		return s;
	}
}

public class TwoClassStaticMethod {

	public static void main(String[] args) {
	 A a= new A();
	 a.Demo(90);
	 B.show("Ubhale");

	}

}
