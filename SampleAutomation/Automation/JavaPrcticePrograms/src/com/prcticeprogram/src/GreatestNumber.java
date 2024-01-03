package com.prcticeprogram.src;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number");
		int firstnum = scan.nextInt();
		System.out.println("Enter a second number");
		int secondnum = scan.nextInt();

		if (firstnum > secondnum) {
			System.out.println(firstnum+":- First number is greather");
		} else if(firstnum < secondnum) {
			System.out.println(secondnum+":- Second number is greather");
		}else {
			System.out.println("both numbers are same");
		}
	}

}
