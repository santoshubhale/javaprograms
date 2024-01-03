package com.sgtesting.src;

public class ArrayOneD_1 {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 90;
		arr[1] = 11;
		arr[2] = 36;
		arr[3] = 12;
		arr[4] = 34;
		arr[5] = 55;
		System.out.println("*************for loop ************");
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("*********for each loop******");
		for(int z : arr) {
			System.out.println(z+" ");
		}
		System.out.println("***********while loop**********");
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("*********do while*********");
		i=0;
		do {
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);
	}

}
