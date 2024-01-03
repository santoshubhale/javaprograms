package com.java.src;

public class MethodOverloding3 {
		void add(int a , long b ) {
			System.out.println("first argument");
		}
		void add(long a , int b) {
			System.out.println("Second argument");
		}
	public static void main(String[] args) {
		MethodOverloding3 mo = new MethodOverloding3();
		mo.add(1, 30);

	}

}
//o/p:-compile time error