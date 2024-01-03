package com.sgtesting.assignmentday9;

public class IntegerArraySum {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		for(int i=0; i<=arr.length-1; i++) {
			sum=sum+arr[i];
		}
		System.out.println("The count is :- "+sum);
	}

}
