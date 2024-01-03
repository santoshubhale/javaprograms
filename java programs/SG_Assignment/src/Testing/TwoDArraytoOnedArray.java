package Testing;

public class TwoDArraytoOnedArray {

	public static void main(String[] args) {
		//Q3: Assign 2 D array to 1 D array?

		int arr[][] = {{1,2},{3,4},{5,6}};
		int res[] = new int[arr.length*arr[0].length];
		int x=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				res[x]=arr[i][j];
				x++;
			}
		}
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
