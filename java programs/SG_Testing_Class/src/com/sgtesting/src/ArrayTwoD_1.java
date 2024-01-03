package com.sgtesting.src;

public class ArrayTwoD_1 {

	public static void main(String[] args) {
		int[][] array = new int[3][2];
		array[0][0] = 11;
		array[0][1] = 22;
		array[1][0] = 33;
		array[1][1] = 44;
		array[2][0] = 55;
		array[2][1] = 66;
		System.out.println("*******for loop ********");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("*******for each loop*******");
		for (int[] x : array) {
			for (int x1 : x) {
				System.out.print(x1 + " ");
			}
			System.out.println();
		}
		System.out.println("*******while loop********");
		int i=0;
		while(i<array.length) {
			int j=0;
			while(j<array[i].length) {
				System.out.print(array[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
	System.out.println("*********do while loop*******");
			i=0;
			do {
				 j=0;
				do {
					System.out.print(array[i][j]+" ");
					j++;
				}while(j<array[i].length);
				System.out.println();
				i++;
			}while(i<array.length);
		}
	}

}
