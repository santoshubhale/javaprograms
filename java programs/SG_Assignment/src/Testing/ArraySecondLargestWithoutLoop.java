package Testing;

import java.util.Arrays;

public class ArraySecondLargestWithoutLoop {

	public static void main(String[] args) {
		//Q17. How to find the 2nd largest number from the given array?
		int arr[]= {1,23,45,33,22,12,12,47,88,89};
		Arrays.sort(arr);
		System.out.println("Second largest="+arr[arr.length-2]);

	}

}
