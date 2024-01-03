package arrayprogram;

public class SquareNumber {
// Programmatically assign the square of first 10 no in order into 1-d arrays. read 2nd half off the element
	public static void main(String[] args) {
		
		
		
		int arr [] = new int [10];
		int b=0;
		for(int j=1; j<=10; j++) {
			arr[b]=j;
			b++;
		}
		for(int k=arr.length/2; k<arr.length; k++) {
			System.out.println(arr[k]+"^"+arr[k]+"="+arr[k]*arr[k]);
		}
	}

}
