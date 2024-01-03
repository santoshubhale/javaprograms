package com.sgtesting.assignmentday10;

public class Ques10 {

	public static void main(String[] args) {
		int x[][]= {{100,201,302},{401,503,600},{701,805,904}};
		for(int i =0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				int y=x[i][j]%2;
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
