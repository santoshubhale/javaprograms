package Testing;

public class OneDArraytoTwoDArray {
	// Q2: Assign 1 D array to 2 D array?

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };


		int res[][] = new int[3][3];
		int x = 0;
		
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				res[i][j]=arr[x];
				x++;
			}
		}
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
