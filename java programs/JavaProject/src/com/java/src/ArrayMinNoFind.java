package com.java.src;

public class ArrayMinNoFind {
static void min(int []arr) {
	int min = arr[0];
	for(int i=1;i<arr.length;i++)
		if(min>arr[i])
			min=arr[i];
	System.out.println(min);
		
}
	public static void main(String[] args) {
		int a[]= {12,23,34,45,56,67,78,89,90,2,4,6,7,89,12,3,3,4,5,6,};
		min(a);
		
	}

}
