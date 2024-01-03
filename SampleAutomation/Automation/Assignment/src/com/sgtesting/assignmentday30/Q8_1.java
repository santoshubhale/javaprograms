package com.sgtesting.assignmentday30;

public class Q8_1 {

	public static void main(String[] args) {
		String s = "PROGRAM";

		for (int i = s.length(); i >= 0; i--)

		{

			for (int j = 0; j < i; j++)

			{

				System.out.print(" " + s.charAt(j));

			}

			System.out.println();

		}

	}

}
