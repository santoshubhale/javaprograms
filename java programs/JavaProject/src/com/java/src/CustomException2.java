package com.java.src;

public class CustomException2 {
	static void validage(int age)throws  Exception{
		if(age<18) {
			throw new CustomException("age is not eligible for vote");
		}else {
			System.out.println("eligible for vote");
		}
	}
	public static void main(String[] args) {
		try {
			validage(10);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
