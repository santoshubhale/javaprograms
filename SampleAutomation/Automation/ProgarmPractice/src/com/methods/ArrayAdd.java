package com.methods;

class ArrayDemo {
	int [][]arr(int a[][], int b[][]){
		int c[][]=new int [a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
}

public class ArrayAdd {

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int y[][]= {{10,11,12},{13,14,15},{16,17,18}};
		int res[][] =ad.arr(x,y);
		// Display the Addition number
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		// count without length function
		int count = 0;
		for(int k[]: res) {
			for(int aa : k) {
				count++;
			}
			
		}
		System.out.println("Total count :- "+count);
		System.out.println("---------------------");
		// digonal matrix
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][i]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		//sum of all metrix
		int sum=0;
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				sum=sum+res[i][j];
			}
		}
		System.out.println("Sum of the element = "+sum);
		System.out.println("--------------------------");
	}

}
