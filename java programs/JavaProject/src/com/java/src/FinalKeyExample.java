package com.java.src;

public class FinalKeyExample {

	final int age=18;
	
	void display() {
		 age = 20;
		System.out.println(age);
	}
	public static void main(String[] args) {
		FinalKeyExample fk = new FinalKeyExample();
		fk.display();
	}

}
