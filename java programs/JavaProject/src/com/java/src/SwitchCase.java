package com.java.src;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character");
		char c = scan.next().charAt(0);
		System.out.println("Enter X value");
		float x = scan.nextFloat();
		System.out.println("Enter Y value");
		float y = scan.nextFloat();

		switch (c) {
		case '+': {
			float z = x + y;
			System.out.println(z);
			break;
		}
		case '-':{
			float z= x-y;
			System.out.println(z);
			break;
			
		}
		case '*':{
			float z= x*y;
			System.out.println(z);
			break;
		}
		case '/':{
			float z= x/y;
			System.out.println(z);
			break;
		}
		case '%':{
			float z= x%y;
			System.out.println(z);
			break;
		}
		default:
			System.out.println("error Symbol");
		}

	}

}
