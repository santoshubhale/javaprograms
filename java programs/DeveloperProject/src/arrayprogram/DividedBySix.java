package arrayprogram;

public class DividedBySix {
	// Programmatically assign no bet'n 100 to 200 which are divisible by 6 in 1-d
	// array , read second half off the element
	public static void main(String[] args) {
		int count = 0;
		for (int a = 100; a <= 200; a++) {
			if ((a % 6) == 0) {
				count++;
			}
		}
		System.out.println("Total count:-" + count);
		int x = 0;
		int arr[] = new int[count];
		for (int i = 100; i <= 200; i++) {
			if ((i % 6) == 0) {
				arr[x] = i;
				x++;

			}
		}
		for (int j = (arr.length) / 2; j < arr.length; j++) {

			System.out.println(arr[j]);

		}

	}
}