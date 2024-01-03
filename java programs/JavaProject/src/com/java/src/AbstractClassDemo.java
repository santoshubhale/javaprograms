package com.java.src;

abstract class AbstractClassDemo {
	abstract void display();
}

class myclass extends AbstractClassDemo {

	void display() {
		System.out.println("Abstract Method?");
	}

	public static void main(String[] args) {
		AbstractClassDemo ac = new myclass();
		ac.display();
	}

}