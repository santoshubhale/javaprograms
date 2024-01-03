package com.sgtesting.assignmentday18;

class TwoDtoOneDDemo {
	static int [] arr(int a[][]){
		int res[]= new int[a.length*a[0].length];
		int k=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				 res[k]=a[i][j];
				k++;
			}
		}
		return res;
	}
}

public class Q4TwoDToOneD {

	public static void main(String[] args) {
		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int z[] = TwoDtoOneDDemo.arr(x);
		for(int i=0; i<z.length; i++) {
			System.out.println(z[i]);
		}

	}

}
