package com.sgtesting.src;

import java.util.Scanner;

public class CleanCode {
	final static int First_unit = 1;
	final static int Second_unit = 100;
	final static int Third_unit = 200;
	final static int First_unit_rate = 1;
	final static double Second_unit_rate = 1.5;
	final static double Third_Unit_rate = 2.5;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int unit = scan.nextInt();
		if ((unit > First_unit) && (unit <= Second_unit)) {
			int a = unit * First_unit_rate;
			System.out.println("Amount :-"+a);
		} else if ((unit > Second_unit) && (unit <= Third_unit)) {
			double b = ((Second_unit * First_unit_rate) + ((unit - Second_unit) * Second_unit_rate));

			System.out.println("Amount :-"+b);
		} else if (unit > Third_unit) {
			double c = ((Second_unit * First_unit_rate) + ((Third_unit - Second_unit) * Second_unit_rate)
					+ ((unit - Third_unit) * Third_Unit_rate));

			System.out.println("Amount :-"+c);
		} else {
			System.out.println("Invalid ");
		}

	}

}
