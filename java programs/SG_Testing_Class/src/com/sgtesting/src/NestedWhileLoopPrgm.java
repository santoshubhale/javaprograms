package com.sgtesting.src;

public class NestedWhileLoopPrgm {

	public static void main(String[] args) {
		int i =1;
		while(i<=6) {
			int j = 1;
			while(j<=3) {
				System.out.print(" *");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
