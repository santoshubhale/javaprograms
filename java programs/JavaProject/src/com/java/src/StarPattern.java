package com.java.src;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//o/p:-
/* Enter number
5
*
**
***
****
*****
******
*/