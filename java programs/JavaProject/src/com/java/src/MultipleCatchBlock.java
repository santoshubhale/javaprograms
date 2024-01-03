package com.java.src;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
		int i=50/0;
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
			e.printStackTrace();
		}catch (NullPointerException e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}catch (Exception e2) {
			System.out.println(e2);
		}
		System.out.println("Hello i am Printing");
	}

}
