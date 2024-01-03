package com.java.src;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int temp = number;
		int rev = 0;

		while (number > 0) {
			int last = number % 10;
			number = number / 10;
			rev = (rev * 10) + last;
		}
		if (temp == rev) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindrome");
		}

	}

}
