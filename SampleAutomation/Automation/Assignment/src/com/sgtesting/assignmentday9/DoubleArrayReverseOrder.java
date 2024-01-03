package com.sgtesting.assignmentday9;

//WAP to create a double array & the read the element from double array reverse order using do-while loop
public class DoubleArrayReverseOrder {

	public static void main(String[] args) {
//		 double arr[]= {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
//		 int i=arr.length-1;
//		 do {
//		 System.out.println(arr[i]);
//		 i--;
//		 }while(i>=0);
		
		// Another Approch
		double d[] = new double[5];
		d[0] = 98.3;
		d[1] = 93.5;
		d[2] = 91.1;
		d[3] = 92.5;
		d[4] = 101.9;
		
		int i = d.length-1;
		do {
			System.out.println(d[i]);
			i--;
		} while (i >= 0);

	}

}
