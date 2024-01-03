package com.java.src;

public class ThrowExceptionUsingSuperKey2 {

	public static void main(String[] args) {
		try {
			throw new ThrowExceptionUsingSuperKey("this is UserDefinedException exception");
		}catch (ThrowExceptionUsingSuperKey ude) {
			System.out.println("Catch the Exception");
			System.out.println(ude.getMessage());
		}

	}
}
