package com.sgtesting.src;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		int n = 10;
		switch(n) {
		case 1 :
			System.out.println("one");
		case 2 :
			System.out.println("two");
		case 7 :
			System.out.println("seven");
		case 10 :
			System.out.println("ten");
		case 11 :
			System.out.println("eleven");
		case 77 :
			System.out.println("seventy seven");
			default:
				System.out.println("invalid number");
		}

	}

}
