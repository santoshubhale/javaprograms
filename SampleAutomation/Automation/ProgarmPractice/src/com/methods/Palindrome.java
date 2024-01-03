package com.methods;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); // 121

		int temp = n;
		int sum = 0;

		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindrome");
		}
	}

}
