package arrays;

public class SubstractionOfTwoDArray {

	public static void main(String[] args) {
		int a[][]= {{9,8,7},{11,12,13},{13,12,11}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]= new int [a.length][b.length];
		if(a.length==b.length) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}else {
			System.out.println("Cann't perform the substraction");
		}
	}

}
