package com.sgtesting.src;

import java.util.Scanner;

// Find the class for the given marks ranging from 1 to 100
public class LadderIfStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a marks");
		int marks = scan.nextInt();
		if((marks>=80) && (marks <100)) {
			System.out.println("Distinction");
		}else if((marks>=60)&& (marks<80)) {
			System.out.println("First class");
		}else if((marks>=40) && (marks<60)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail better luck next time");
		}

	}

}
