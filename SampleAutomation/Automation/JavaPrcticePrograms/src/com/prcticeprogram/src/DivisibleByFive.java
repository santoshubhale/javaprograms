package com.prcticeprogram.src;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num % 5 == 0) {
			System.out.println(num + " :- is divisible by five");
		} else {
			System.out.println(num + " :- is not divisible by five");
		}

	}

}