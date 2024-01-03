package com.sgtesting.src;

public class ArrayTwoD {

	public static void main(String[] args) {
		int array[][] = {{10,20,11,7},{31,35,12,8}};
		
		System.out.println("*********for loop**********");
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("******for each loop**********");
		for(int[] x1 : array) {
			for(int x :x1) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		System.out.println("***********while loop***********");
		int i=0;
		while(i<array.length) {
			int j =0;
			while(j<array[i].length) {
				System.out.print(array[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("**********do while loop*******");
		 i=0;
		do {
			int j=0;
			do {
				System.out.print(array[i][j]+" ");
				j++;
			}while(j<array[i].length);
			System.out.println();
			i++;
		}while(i<array.length);
	}

}
