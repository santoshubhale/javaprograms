package com.sgtesting.assignmentday23;

abstract class Person {
	static void showfirstName(String name) {
		System.out.println("firstName =" + name);
	}

	static void showage(int age) {
		System.out.println("Age =" + age);
	}

}

class Person1 extends Person {
	static void showAddress(String Address) {
		System.out.println("Address =" + Address);
	}

	static void showId(int Id) {
		System.out.println("Id =" + Id);
	}
}

public class Q1StaticMethodDemo {

	public static void main(String[] args) {

		Person1.showfirstName("Santosh");
		Person1.showage(27);
		Person1.showId(777716);
		Person1.showAddress("Andan Hotel");

	}

}
