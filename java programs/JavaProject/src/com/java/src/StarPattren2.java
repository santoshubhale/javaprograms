package com.java.src;

public class StarPattren2 {

	public static void main(String[] args) {
		int n =5;
		for(int i=0; i<=5; i++) {
			for(int j= 5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//o/p:-
/*
******
*****
****
***
**
*
*/