package com.sgtesting.programs;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		char st[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' } };
		for (char x[] : st) {
			for (char a : x) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
