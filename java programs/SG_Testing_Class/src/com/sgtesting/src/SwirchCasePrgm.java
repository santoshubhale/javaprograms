package com.sgtesting.src;

import java.util.Scanner;

public class SwirchCasePrgm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a color");
		String color = s.nextLine();

		switch (color) {
		case "red":
			System.out.println("Danger");
			break;
		case "blue":
			System.out.println("Oceen");
			break;
		case "black":
			System.out.println("Ever green");
			break;
		default:
			System.out.println("invalid");
		}
	}

}
