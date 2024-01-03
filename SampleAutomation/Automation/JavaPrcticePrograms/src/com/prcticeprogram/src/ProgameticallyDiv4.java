package com.prcticeprogram.src;

public class ProgameticallyDiv4 {

	public static void main(String[] args) {
		int count =0;
		for(int i =100; i>=50; i--) {
			if(i%4==0) {
				count++;
			}
		}
		System.out.println("Total count:-"+count);
		int x=0;
		int arr[]= new int[count];
		for(int j=100; j>=50; j--) {
			if(j%4==0) {
				arr[x]=j;
				x++;
			}
		}
		int k=0;
		while(k<arr.length) {
			System.out.println(arr[k]);
			k++;
		}
	}

}
