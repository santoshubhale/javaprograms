package com.java.src;

public class FinalTryCatchExceptionHandling {

	public static void main(String[] args) {
		try {
		int a=123/0;
		System.out.println(a);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			
			System.out.println("Final block executed");
		}
		System.out.println("Namaskara Banglore");
	}

}
