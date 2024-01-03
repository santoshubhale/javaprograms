package com.sgtesting.assignmentday9;

//WAP to create a float array & the read the second half of element from float array using while loop
public class FloatArraySecondHalf {

	public static void main(String[] args) {
//		float ft[] = { 1.1f, 3.3f, 5.5f, 7.7f, 9.9f, 11.11f, 13.13f, 15.15f };
//		int i =ft.length/2;
//		while(i<ft.length) {
//			System.out.println(ft[i]);
//			i++;
//		}

		// Another Approch

		float f[] = new float[4];
		f[0] = 1.2f;
		f[1] = 2.3f;
		f[2] = 3.4f;
		f[3] = 4.5f;
		int i = f.length / 2;
		while (i < f.length) {
			System.out.println(f[i]);
			i++;
		}
	}

}
