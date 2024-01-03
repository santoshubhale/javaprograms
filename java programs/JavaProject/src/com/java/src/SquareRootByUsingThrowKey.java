package com.java.src;

public class SquareRootByUsingThrowKey {

	public static void Num(int num) {
		if(num<1) {
			throw new ArithmeticException("Number is nagative cann't do squre root");
	}else {
		System.out.println("square of " +num+ " "+"is  "+num*num);
	}
	}
	public static void main(String[] args) {
		SquareRootByUsingThrowKey sq = new SquareRootByUsingThrowKey();
		sq.Num(240);

	}

}
