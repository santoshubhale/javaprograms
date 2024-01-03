package com.sgtesting.programs;

public class PattrenDemo {

	public static void main(String[] args) {
		int i = 5;
		do {
			int j = 1;
			do {
				System.out.print(i + " ");
				j++;
			} while (j <= i);
			System.out.println();
			i--;
		} while (i >= 1);

	}

}
