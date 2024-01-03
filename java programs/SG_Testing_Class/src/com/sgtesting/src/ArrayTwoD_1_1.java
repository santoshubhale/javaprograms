package com.sgtesting.src;

public class ArrayTwoD_1_1 {

	public static void main(String[] args) {
		String[][] str1 = { { "Santosh", "ubhale" }, { "hi", "hello" }, { "welcome", "Bangalore" } };
		System.out.println("******for loop*********");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("********for each loop*********");
		for (String[] str2 : str1) {
			for (String str3 : str2) {
				System.out.print(str3 + " ");
			}
			System.out.println();
		}
		System.out.println("*******while loop **********");
		int i=0;
		while(i<str1.length) {
			int j=0;
			while(j<str1[i].length) {
			System.out.print(str1[i][j]+" ");
			j++;
		}System.out.println();
			i++;
		}
		System.out.println("***********do while********");
		i=0;
		do {
			int j=0;
			do {
				System.out.print(str1[i][j]+" ");
				j++;
			}while(j<str1[i].length);
			System.out.println();
			i++;
		}while(i<str1.length);
	}

}
