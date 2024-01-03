package com.sgtesting.assignmentday16;

class CharDemo {
	char[] ch(char a[][]) {
		char[] res = new char[a.length ];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			res[k] = a[0][i];
			k++;

		}
		return res;
	}
}

public class Q4TwoArray1StRow {

	public static void main(String[] args) {
		CharDemo cd = new CharDemo();
		char x[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		char z[] = cd.ch(x);
		for (int i = 0; i < z.length; i++) {

			System.out.print(z[i] + " ");
		}

	}

}
