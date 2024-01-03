package com.java.src;

public class FinallyKey {

	public static void main(String[] args) {
		try {
		int a=1020;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("i am excecuting");
		}
		System.out.println("Namskara Bangalore");
	}

}
