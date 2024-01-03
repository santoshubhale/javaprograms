package com.prcticeprogram.src;

public class TwoDtoOneD {

	public static void main(String[] args) {
		int arr[][]= {{11,22,33},{44,55,66},{77,88,99}};
		int b[]= new int[9];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				b[k]=arr[i][j];
				k++;
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
