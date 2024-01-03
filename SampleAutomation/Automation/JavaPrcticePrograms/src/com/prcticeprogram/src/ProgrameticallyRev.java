package com.prcticeprogram.src;

public class ProgrameticallyRev {

	public static void main(String[] args) {
		int count=0;
		for(int i=200; i>=100; i--) {
			if(i%9==0) {
			count++;
			}
		}
		System.out.println(count);
		int arr[]= new int [count];
		int x=0;
		for(int j=200; j>=100; j--) {
			if(j%9==0) {
				arr[x]=j;
				x++;
			}
		}
		for(int m=arr.length-1; m>=0; m--) {
			System.out.println(arr[m]);
		}
	}

}
