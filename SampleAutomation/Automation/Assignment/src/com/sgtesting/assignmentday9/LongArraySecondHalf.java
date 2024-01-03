package com.sgtesting.assignmentday9;

//WAP to create a long array & the read the second half of  element from long array using do-while loop
public class LongArraySecondHalf {

	public static void main(String[] args) {
//		long ln[] = { 1234, 5678, 91011, 121314, 151617, 181920, 212223, 242526, 272829, 303132 };
//		int i = ln.length/2;
//		do {
//			System.out.println(ln[i]);
//			i++;
//		}while(i<ln.length);

		// Another Approch
		long l[] = new long[4];
		l[0] = 324;
		l[1] = 543;
		l[2] = 998;
		l[3] = 567;
		int i = l.length / 2;
		do {
			System.out.println(l[i]);
			i++;
		} while (i < l.length);

	}

}
