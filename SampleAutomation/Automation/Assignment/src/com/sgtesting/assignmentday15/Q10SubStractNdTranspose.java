package com.sgtesting.assignmentday15;

class SubDemo {
	void subTran(int a[][], int b[][]) {
		
		if (a.length == b.length && a[0].length == b[0].length) {
			int z[][]=new int [a.length][a[0].length];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					z[i][j] = a[i][j]-b[i][j];
					
				}
			} 
				for(int k=0; k<z.length; k++) {
					for(int l=0; l<z[k].length; l++) {
					System.out.print(z[l][k]+" ");
					}
				System.out.println();
			}
			
		}

	}
}

public class Q10SubStractNdTranspose {

	public static void main(String[] args) {
		SubDemo sd = new SubDemo();
		int x[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int y[][]= {{1,2,3},{4,5,6},{7,8,9}};
		sd.subTran(x, y);

	}

}
