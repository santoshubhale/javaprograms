package com.sgtesting.src;

public class NestedWhileLoopWithNumber {

	public static void main(String[] args) {
		int x =1;
		int i=1;
		while(i<=3) {
			int j = 1;
			while(j<=3) {
				System.out.print(" "+x);
				j++;
				x++;
			}
			System.out.println();
			i++;
		}

	}

}
