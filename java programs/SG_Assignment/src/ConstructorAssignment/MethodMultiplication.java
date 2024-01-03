package ConstructorAssignment;

import java.util.Arrays;

//WAM to perform multiplication of 2 numbers

class Multi {
	public void multiplication(int a[][], int b[][]) {
		int arows = a.length;
		int acols = a[0].length;
		int brows = b.length;
		int bcols = b[0].length;
		
		if(arows==bcols) {
			int c[][] = new int [arows]  [bcols];
			for(int i=0;i<arows; i++) {
				for(int j=0; j<bcols; j++) {
					for(int k=0; k<acols; k++) {
						c[i][j]+=a[i][k]*b[k][j] ;
					}
				}
			}
			System.out.print("multiplication:-"+Arrays.deepToString(c));
		}else {
			System.out.println("Can't perform please check the size");
		}

	}

}

public class MethodMultiplication {

	public static void main(String[] args) {
		Multi m = new Multi();
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{7,8},{9,10},{11,12}};
		m.multiplication(a, b);
		
	}

}
