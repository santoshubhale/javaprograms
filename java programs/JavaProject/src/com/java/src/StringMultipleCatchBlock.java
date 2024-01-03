package com.java.src;

public class StringMultipleCatchBlock {

	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println(s.length());
		}catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}catch(Exception e3) {
			System.out.println(e3);
		}
			System.out.println("rest code printed");
	}

}
