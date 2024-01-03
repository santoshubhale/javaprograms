package com.sgtesting.assignmentday30;

public class Q5 {

	public static void main(String[] args) {

		String s1 = "madam";

		StringBuilder stb = new StringBuilder(s1);

		String s2 = stb.reverse().toString();

		System.out.println("output : " + s2);

		if (s1.equals(s2)) {

			System.out.println("given String is pallindrome");

		}else {
			System.out.println("given String is  not pallindrome");
		}

	}
}