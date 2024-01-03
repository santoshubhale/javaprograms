package com.java.src;

public class NestedTryBlockExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("first");
			try {
				int i = 50 / 0;
				System.out.println(i);
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("first one");
			}
			try {
				int a[] = new int[5];
				a[5] = 4;
				System.out.println(a[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("second one");

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("hi hello");
		} catch (Exception e) {
			System.out.println("hi");
		}
	}
}
