package com.sgtesting.programs;

public class TwoDArraysDemo1 {

	public static void main(String[] args) {
		String str [][]= {{"Apple","ball","cat"},{"dog","elephant","fish"},{"got","horse","ice"}};
		for(int i= 0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
	}

}
