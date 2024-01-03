package com.sgtesting.assignmentday18;

class AdditionDemo {
	static int[] add(int a[], int b[]) {
		int x[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i] + b[i];
		}
		return x;
	}
}

public class Q1TwoOneDArrayReturn {

	public static void main(String[] args) {
		int y[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int z[] = { 11, 22, 13, 23, 34, 12, 11, 10, 99 };
		int res[] = AdditionDemo.add(y, z);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}
}