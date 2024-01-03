package Testing;

public class ArraySecondLargestWithLoop {

	public static void main(String[] args) {
		//Q17. How to find the 2nd largest number from the given array?
		int arr[]= {1,4,5,33,44,22,55,66,77,98,92,88};
		int first=0;
		int second=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}else if(arr[i]>second) {
				second=arr[i];
			}
		}
		System.out.println(second);

	}

}
