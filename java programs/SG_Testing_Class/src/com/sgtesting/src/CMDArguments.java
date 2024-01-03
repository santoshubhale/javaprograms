package com.sgtesting.src;

public class CMDArguments {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		
		double result= num1+num2;
		System.out.println("value "+result);

	}

}
