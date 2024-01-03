package com.sgtesting.assignmentday23;

abstract class Student {
	static {
		System.out.println("Hi....! I am Static block");
	}

}

class College extends Student {

}

public class Q2StaticBlockDemo {

	public static void main(String[] args) {

		College s = new College();

	}

}
