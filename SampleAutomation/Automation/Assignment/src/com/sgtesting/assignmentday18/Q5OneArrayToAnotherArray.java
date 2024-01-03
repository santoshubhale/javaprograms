package com.sgtesting.assignmentday18;
class ArrayDemo{
	static int []array(int a[]){
		int x=0;
		int arr[]=new int [a.length];
		for(int i=a.length-1; i>=0; i--) {
			arr[x]=a[i];
			x++;
		}
		return arr;
	}
}

public class Q5OneArrayToAnotherArray {

	public static void main(String[] args) {
		int z[]= {1,2,3,4,5,6,7,8,9};
		int res[]=ArrayDemo.array(z);
		for(int i=0;i<res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println("----------------");
		// for each
		for(int a : res) {
			System.out.println(a);
		}

	}

}
