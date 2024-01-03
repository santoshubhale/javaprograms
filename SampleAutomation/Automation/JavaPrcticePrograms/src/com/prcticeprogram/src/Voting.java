package com.prcticeprogram.src;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a age of person");
		int age = scan.nextInt();
		if(age>=18) {
			System.out.println("Person is eligible for voting");
		}else {
			System.out.println("Person is not eligible for voting");
		}
	}

}
