package com.sgtesting.src;

public class AlphabetByDoWhilePrgm {

	public static void main(String[] args) {
		int i=0;
		do {
			int val = (i+65);
			char ch = (char)val;
			System.out.print(" "+ch);
			i++;
		}while(i<26);
	}

}
