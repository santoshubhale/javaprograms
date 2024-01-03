package com.prcticeprogram.src;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		float num = scan.nextFloat();
		
		if(num<0) {
			System.out.println("Absolute value is :-"+(-1)*num);
		}else {
			System.out.println("Absolute value "+num);
		}

	}

}
