package com.java.src;
//problem Statement :- for upto100 unit = 1rs, upto 100 to 200 unit = 1.50rs, more then 200 = 2.50 rs 

import java.util.Scanner;

public class IfElse {

	final static double FirstUnit = 0;
	final static double SecondUnit = 100;
	final static double ThirdUnit = 200;

	final static double FirstUnitprice = 1;
	final static double SecondUnitprice = 1.5;
	final static double ThirdUnitprice = 2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter unit");
		double unit = scan.nextDouble();
		if (unit > FirstUnit && unit <= SecondUnit) {
			double cost = unit * FirstUnitprice;
			System.out.println(cost);
		} else if (FirstUnit > unit && ThirdUnit < unit) {
			double cost = (SecondUnit * FirstUnitprice) + ((unit - SecondUnit) * SecondUnitprice);
			System.out.println(cost);
		} else if (unit > ThirdUnit) {
			double cost = ((SecondUnit * FirstUnitprice) + (SecondUnit - FirstUnit) * SecondUnitprice
					+ (unit - ThirdUnit) * ThirdUnitprice);
			System.out.println(cost);

		}
	}
}
