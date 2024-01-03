package com.sgtesting.assignmentday10_1;

public class Ques3 {

	public static void main(String[] args) {
		int count =0;
		for(int i=200;i>=100;i--) {
			if(i%9==0) {
				count++;
			}
		}
		System.out.println("Total count is = "+count);
		
		int array[]= new int[count];
		int x=0;
		for(int j=200; j>=100; j--) {
			if(j%9==0) {
				array[x]=j;
				x++;
			}
		}
		for(int m=array.length/2; m<array.length; m++) {
			System.out.println(array[m]);
		}
	}

}
