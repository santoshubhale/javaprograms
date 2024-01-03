package com.sgtesting.assignmentday10;

public class Ques2 {

	public static void main(String[] args) {
		byte a[][]= {{11,22,33},{44,55,66},{77,88,99}};
		
		int i=0;
		while(i<a.length) {
			int j=0;
			while(j<a[i].length) {
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
