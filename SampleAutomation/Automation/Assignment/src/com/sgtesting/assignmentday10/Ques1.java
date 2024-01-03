package com.sgtesting.assignmentday10;

public class Ques1 {

	public static void main(String[] args) {
		double arr[][]= {{1.1,2.1,3.1},{4.2,5.2,6.3},{7.3,8.3,9.3}};
		
		for(int i =arr.length-1; i>=0; i--) {
			for(int j =arr[i].length-1; j>=0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
