package com.sgtesting.assignmentday10_1;

public class Ques1 {

	public static void main(String[] args) {
		int count=0;
		for(int i=100; i>=50;i--) {
			if(i%4==0) {
				count++;
			}
		}
		System.out.println("Total count = "+count);
		int arr[]=new int[count];
		int x=0;
		for(int j=100; j>=50; j--) {
			if(j%4==0) {
				arr[x]=j;
				x++;
			}
		}
		for(int m=0; m<arr.length; m++) {
			System.out.println(arr[m]);
		}
	}

}
