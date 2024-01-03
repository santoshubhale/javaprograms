package com.java.src;

import java.util.Scanner;

public class AdditionOfEvenAndOddNo {

	public static void main(String[] args) {
		int empty=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 0 for even number 1 for odd");
		int s=sc.nextInt();
		System.out.println("Enter a range");
		int range =sc.nextInt();
		for(int i=s; i<=range;i+=2)
			System.out.print("+"+i);
		for(int i=s; i<=range;i+=2)
			empty=i+empty;
			System.out.println("="+empty);

	}

}
