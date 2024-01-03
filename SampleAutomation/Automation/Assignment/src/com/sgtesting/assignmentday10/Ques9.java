package com.sgtesting.assignmentday10;

public class Ques9 {

	public static void main(String[] args) {
		long l[][] = { { 12, 13, 14 }, { 15, 16, 17 }, { 18, 19, 20 } };
		long sum =0;
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				sum=sum+l[i][j];

			}
		}
		System.out.println("Total sum is :- "+sum);
	}

}
