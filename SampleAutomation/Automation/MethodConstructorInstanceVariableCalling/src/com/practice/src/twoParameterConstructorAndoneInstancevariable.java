package com.practice.src;

class Demo {
	int a = 10;
	String b = "Hi";

	Demo(int x) {
		System.out.println(a);
		System.out.println(x);

	}
	Demo(){
		System.out.println(b);
	}
}

public class twoParameterConstructorAndoneInstancevariable {

	public static void main(String[] args) {
		Demo d1 = new Demo(100);
		Demo d = new Demo();

	}

}
