package com.prcticeprogram.src;

import java.util.Scanner;

public class MarriageAnotherOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a male age");
		int maleage = scan.nextInt();
		System.out.println("Enter a female age");
		int femaleage = scan.nextInt();
		
		if(maleage>=21 && femaleage>=18) {
			System.out.println("Eligible for marriage");
		}else {
			System.out.println("Not eligible for marriage");
		}
	}

}
