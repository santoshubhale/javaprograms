package com.sgtesting.assignmentday10;

public class Ques7 {

	public static void main(String[] args) {
		char arr[][]= {{'a','b','c'},{'d','e','f'}};
		
		int i=0;
		do {
			int j=0;
			do {
				System.out.print(arr[i][j]+" ");
				j++;
			}while(j<arr[i].length);
			System.out.println();
			i++;
		}while(i<arr.length);

	}

}
