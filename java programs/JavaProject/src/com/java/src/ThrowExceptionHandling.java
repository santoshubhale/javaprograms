package com.java.src;

public class ThrowExceptionHandling {
	public static void age(int age) {
		if (age < 18) {
			throw new ArithmeticException("person is not eligible for vote");
		} else {
			System.out.println("person is eligible for vote");
		}
	}

	public static void main(String[] args) {
		age(11);

	}

}
