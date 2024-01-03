package com.sgtesting.src;

import java.util.Arrays;

public class ArrayMultiplicationMatrix {

	public static void main(String[] args) {
		// Q11: Multiplication of 2 arrays (Matrix multiplication)?

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

		int arows = a.length;
		int acols = a[0].length;
		int brows = b.length;
		int bcols = b[0].length;

		if (arows == bcols) {
			int c[][] = new int[arows][bcols];
			for (int i = 0; i < arows; i++) {
				for (int j = 0; j < bcols; j++) {
					for (int k = 0; k < acols; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			System.out.println(Arrays.deepToString(c));
		} else {
			System.out.println("can't perform multiple matrix ");
		}

	}

}
