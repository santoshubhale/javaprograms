package com.java.src;

import java.util.Scanner;

public class ReveresString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String s = scan.next();
		String str = " ";
		for (int i = 0; i <s.length(); i++) {
			str = s.charAt(i)+ str;
		}
		System.out.println(str);

	}

}
