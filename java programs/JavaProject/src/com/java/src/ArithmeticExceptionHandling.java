package com.java.src;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {

		int i1 = 120 / 6;
		int i2 = 120 / 5;
		try {
			int i3 = 120 / 0;
			System.out.println(i1 + "" + i2 + "");// +i4);//not execute
		} catch (ArithmeticException a) {
			System.out.println(a);
		}
		int i4 = 120 / 10;
		System.out.println(i1 + "" + i2 + "" + i4);
	}
}
