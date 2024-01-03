package com.java.src;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		try {
		int []a= {10,20,30};
		System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("Rest of the code");
	}

}
