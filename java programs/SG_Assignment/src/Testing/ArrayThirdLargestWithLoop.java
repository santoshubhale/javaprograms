package Testing;

public class ArrayThirdLargestWithLoop {

	public static void main(String[] args) {
		// Q18. How to find the 3rd largest number from the given array?
		int arr[] = { 1, 2, 3, 2, 44, 32, 47, 89, 75, 77, 43, 23, 45, 67, 89 };
		int first = 0;
		int second = 0;
		int third = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];

			} else if (arr[i] > second) {
				third = second;
				second = arr[i];

			} else if (arr[i] > third) {
				 third=arr[i];
			} else {
			}
		}
		System.out.println("third largest:-" + third);
	}
}