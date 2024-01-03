package arrayprogram;

public class DividedByFour {
	// Programmatically assign no 100 to 50 no which are divisible by 4 int0 1-d
	// array, read the reverse order
	public static void main(String[] args) {
		int x = 0;
		for (int i = 100; i >= 50; i--) {
			if ((i % 4) == 0) {
				x++;
			}
		}
		System.out.println("Total count:-"+x);

		int arr[] = new int[x];
		int a = 0;
		for (int j = 100; j >= 50; j--) {
			if ((j % 4) == 0) {
				arr[a] = j;
				a++;

			}
		}
		for (int b = arr.length - 1; b >= 0; b--) {
			System.out.println(arr[b]);
		}

	}

}
