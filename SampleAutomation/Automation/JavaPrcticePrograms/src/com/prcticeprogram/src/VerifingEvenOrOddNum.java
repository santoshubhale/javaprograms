package com.prcticeprogram.src;

import java.util.Scanner;

public class VerifingEvenOrOddNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" :- is even number ");
		}else if (num%2 ==1) {
			System.out.println(num+" :- is odd number ");
		}else {
			System.out.println("Invalid number");
		}

	}

}
