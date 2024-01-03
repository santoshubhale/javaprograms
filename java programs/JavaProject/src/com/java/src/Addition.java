package com.java.src;

public class Addition {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		int c=add(a,b);
		System.out.println("Addition is = "+c);
	}

	private static int add(int n1, int n2) {
		int s;
		s=n1+n2;
		return s;
	}

}
