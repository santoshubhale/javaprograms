package com.sgtesting.src;

public class NestedForLoop {

	public static void main(String[] args) {
		//{}--->indicate - rows
		// 2data ---> 2 column
		int arr[][]= {{10,20},{30,40},{50,60}};
		
		for(int[] x : arr ) {
			for(int x1 : x) {
				System.out.print(" "+x1);
			}
			System.out.println();
		}

	}

}
