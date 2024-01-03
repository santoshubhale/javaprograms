package com.java.src;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20,t;
		System.out.println("before swap value " +a+" "+" "+b);
//		t=a;
//		a=b;
//		b=t;
//		System.out.println("after swap value "+a+" "+" "+b);
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap value "+a+" "+" "+b);

	}

}
