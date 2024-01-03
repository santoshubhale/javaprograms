package com.java.src;

public class AdditionUptoTheRange {

	public static void main(String[] args) {
		int a =20 , empty = 0;
		
		for(int i = 1; i<=a; i++)
			System.out.print("+"+i);
		for(int i = 1; i<=a; i++)
			empty = empty+i;
			System.out.println("="+empty);
		

	}

}
