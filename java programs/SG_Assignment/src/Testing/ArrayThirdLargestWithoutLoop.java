package Testing;

import java.util.Arrays;

public class ArrayThirdLargestWithoutLoop {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,33,55,22,98,77,76,90};
		Arrays.sort(arr);
		System.out.println("Second Largest:-"+arr[arr.length-3]);

	}

}
