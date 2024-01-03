package com.sgtesting.assignmentday9;

// WAP to read the element from byte array in reverse order
public class ByteArrayReverse {

	public static void main(String[] args) {

//		byte a[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
//		for (int i = a.length - 1; i >= 0; i--) {
//			System.out.println(a[i]);
//		}

		// Another Approch

		byte b[] = new byte[4];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.println(b[i]);
		}

	}
}