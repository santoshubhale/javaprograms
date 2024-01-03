package com.sgtesting.src;

import java.util.Scanner;

public class NestedSwitchPrgm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a color");
		String item = s.nextLine();
		String category = "flower";

		switch (category) {

		case "flower":

			switch (item) {
			case "red":
				System.out.println("Danger");
				break;
			case "blue":
				System.out.println("Occean");
				break;
			case "black":
				System.out.println("Formal color");
				break;
			default:
				System.out.println("Invalid color " + item);
					
			}
		default:
			System.out.println("Invalid "+category);
		}

	}

}
