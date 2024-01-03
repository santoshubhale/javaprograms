package com.sgtesting.assignmentday10;

public class Ques11 {

	public static void main(String[] args) {
		int arr[][] = { { 101, 202, 303 }, { 404, 505, 606 }, { 707, 808, 909 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
