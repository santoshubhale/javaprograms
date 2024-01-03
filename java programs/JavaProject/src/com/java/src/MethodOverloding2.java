package com.java.src;

public class MethodOverloding2 {
	void sum(int a , int b) {
		System.out.println("int argument invoke");
		
	}

	void sum (long a , long b) {
		System.out.println("long argument invoke");
	}
	
	public static void main(String[] args) {
		MethodOverloding2 mo = new MethodOverloding2();
		mo.sum(1, 30);
		

	}

}
//o/p :- int argument invoke
