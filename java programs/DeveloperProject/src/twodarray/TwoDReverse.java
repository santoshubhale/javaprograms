package twodarray;

public class TwoDReverse {
//create 2-d String array 3*3 read the element in reverse order
	public static void main(String[] args) {
		String arr[][]= {{"one","two","three"},{"four","five","six"},{"seven","eight","nine"}};
		
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[i].length-1; j>=0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
