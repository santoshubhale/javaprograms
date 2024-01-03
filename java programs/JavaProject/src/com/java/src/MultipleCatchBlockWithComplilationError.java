package com.java.src;

public class MultipleCatchBlockWithComplilationError {

	public static void main(String[] args) {
		try {
	int []arr = new int[5];
	arr[5]=30/0;
		}catch(Exception e) {
			System.out.println("common task complited");
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println(e1);
			
		}catch (ArithmeticException e3) {
			System.out.println(e3);
		}
	}

}
