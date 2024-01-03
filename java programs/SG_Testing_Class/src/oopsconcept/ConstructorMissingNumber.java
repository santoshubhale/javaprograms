package oopsconcept;

import java.util.Arrays;
// Q: Write a constructor for displaying the missing numbers from the array?
class Sample {
	Sample(int arr[]) {
		Arrays.sort(arr);
		int x = 0;
		int max = arr[arr.length - 1];

		for (int i = 0; i < max; i++) {
			if (i == arr[x]) {
				x++;
			} else {
				System.out.println("Missing number" + i);
			}
		}
	}
}

public class ConstructorMissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,5,8,11,23,12};
		Sample s = new Sample(arr);

	}

}
