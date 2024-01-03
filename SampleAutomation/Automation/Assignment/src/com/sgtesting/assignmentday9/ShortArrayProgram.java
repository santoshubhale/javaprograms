package com.sgtesting.assignmentday9;

//WAP to create a short array & the read the element from short array using do-while loop
public class ShortArrayProgram {

	public static void main(String[] args) {
//		short sht[] = {12,23,34,45,56,67,78,89,90,99,88};
//		int i =0;
//		do {
//			System.out.println(sht[i]);
//			i++;
//		}while(i<sht.length);
		// Another Approch
		short s[] = new short[6];
		s[0] = 22;
		s[1] = 33;
		s[2] = 45;
		s[3] = 56;
		s[4] = 77;
		s[5] = 88;
		
		int i = 0;
		do {
			System.out.println(s[i]);
			i++;
		} while (i < s.length);

	}

}
