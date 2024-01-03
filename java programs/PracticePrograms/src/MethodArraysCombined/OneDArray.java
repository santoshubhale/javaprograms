package MethodArraysCombined;

class ArrayProgram {

	public void arr(int a[]) {

		for (int x : a) {
			System.out.print(x + " ");
		}

	}
}

public class OneDArray {

	public static void main(String[] args) {
	/*	int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		Array ar = new Array();
		ar.arr(a);*/
		/*
		int a[]= {1,2,3,4,5,6,7,89};
		ArrayProgram ap = new ArrayProgram();
		ap.arr(a);*/
		ArrayProgram ap = new ArrayProgram();
		ap.arr(new int []{1,2,3,4,5,6,7,8,9});
	}
	}

