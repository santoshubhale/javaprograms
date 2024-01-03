package com.sgtesting.assignmentday10_1;

public class Ques2 {

	public static void main(String[] args) {

		for (int i = 70; i >= 1; i--) {
			if (i % 7 == 0) {

			}
		}

		int a[] = new int[10];
		int y = 0;
		for (int j = 70; j >= 1; j--) {
			if (j % 7 == 0) {
				a[y] = j;
				y++;
			}
		}
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.println(a[k]);
		}
	}

}
