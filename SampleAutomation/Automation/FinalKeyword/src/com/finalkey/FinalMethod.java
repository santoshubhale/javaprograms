package com.finalkey;
class Demo{
	final void show() {
		System.out.println("I am final method --->1");
	}
}
class Demo1 extends Demo{
	void show() {
		System.out.println("I am final method --->2");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
		Demo1 d1 = new Demo1();
		d1.show();

	}

}
