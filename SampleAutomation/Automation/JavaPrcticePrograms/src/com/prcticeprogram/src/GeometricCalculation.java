package com.prcticeprogram.src;

import java.util.Scanner;

public class GeometricCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length ");
		double length = scan.nextDouble();
		System.out.println("Enter a breadth");
		double breadth = scan.nextDouble();
		if(length!=breadth) {
			System.out.println("Rectangle");
		}else {
			System.out.println("Square");
		}
	}

}
