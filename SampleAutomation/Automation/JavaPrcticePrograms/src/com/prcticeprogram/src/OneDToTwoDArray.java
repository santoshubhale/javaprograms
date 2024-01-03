package com.prcticeprogram.src;

public class OneDToTwoDArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b = 0;
		int k[][] = new int[3][3];
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				k[i][j] = a[b];
				b++;
			}
		}
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.print(k[i][j] + " ");
			}
			System.out.println();

		}

	}
}
