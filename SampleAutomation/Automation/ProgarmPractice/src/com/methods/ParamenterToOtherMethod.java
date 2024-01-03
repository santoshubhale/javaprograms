package com.methods;

class Maths {
	int add(int a, int b) {
		int c = a+b;
		return c;
	}
	int sub(int a, int b) {
		int c = a-b;
		return c;
	}
	int mul(int a , int b) {
		int c=a*b;
		System.out.println("mul="+c);
		
		return c;
	}
}

public class ParamenterToOtherMethod {

	public static void main(String[] args) {
		Maths m = new Maths();
		m.mul(m.add(10, 20), m.sub(20, 10));

	}

}
