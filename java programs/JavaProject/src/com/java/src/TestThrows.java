package com.java.src;

public class TestThrows {

	public static int divnum(int m, int n) throws ArithmeticException {

		int div = m / n;
		return div;

	}

	public static void main(String[] args) {
		TestThrows tt = new TestThrows();
		try {
			System.out.println(divnum(100, 0));
		} catch (ArithmeticException e) {
			System.out.println("Number is not divided by zero");

		}
		System.out.println("Rest of the code");
	}

}
