package com.java.src;

import java.util.Scanner;

public class EventOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}

	}

}