package com.methods;
class MathsDemo1{
	int add(int a , int b) {
		int c= a+b;
		return c;
	}
	int sub(int a, int b) {
		int c= a-b;
		return c;
	}
	int mul() {
		int a= this.add(100,200);
		int b=this.sub(10, 5);
		int c= a*b;
		System.out.println("mul="+c);
		return c;
	}
}

public class CallingMethodInOtherBody {

	public static void main(String[] args) {
		MathsDemo1 m = new MathsDemo1();
		m.mul();

	}

}
