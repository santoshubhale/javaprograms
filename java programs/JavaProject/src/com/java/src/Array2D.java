package com.java.src;

public class Array2D {

	public static void main(String[] args) {
		int x[][] ={{1,2,3},{6,7,8},{2,3,4}};
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++ ) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}

	}

}