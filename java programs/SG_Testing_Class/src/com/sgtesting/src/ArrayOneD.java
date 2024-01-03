package com.sgtesting.src;

public class ArrayOneD {

	public static void main(String[] args) {
		int arr[] = {10,20,30,45,50,60};
		
		System.out.println("********************for loop*************");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("*****************for each loop**********");
		for(int x : arr) {
			System.out.println(x+" ");
		}
		System.out.println("*************while loop*************");
		int i = 0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("**************do while loop ***************");
		 i = 0;
		do {
			System.out.println(arr[i]);
			i++;
		}while(i<arr.length);
	}

}
