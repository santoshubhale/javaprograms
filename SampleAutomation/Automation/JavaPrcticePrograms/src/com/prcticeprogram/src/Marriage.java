package com.prcticeprogram.src;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a gender");
		String gender= scan.nextLine();
		System.out.println("Enter a age");
		int age = scan.nextInt();
		
		if((gender.equals("male")) && age>=21) {
			System.out.println(gender+":- is eligible for marriage");
		}else if((gender.equals("female")) && age>=18) {
			System.out.println(gender+":- is eligible for marriage");
		}else {
			System.out.println(gender+":- is not eligible for marriage");
		}
	}

}
