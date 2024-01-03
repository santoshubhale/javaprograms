package Testing;

public class ArrayBubblrSort {

	public static void main(String[] args) {
		// bubble sort

		int arr[] = { 1, 23, 45, 22, 77, 12, 32, 44, 56, 79, 112, 443, 11, 24, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.print(arr[i] + " ");
		}
	}

}
