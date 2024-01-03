package Testing;

public class ArrayCompare {

	public static void main(String[] args) {
		// Q9: How to compare 2 arrays?

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4 };
		int flag = 0;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Both are equal");
			else
				System.out.println("Both are not equal");
		} else {
			System.out.println("Uneven size of the array please check it");
		}
	}

}
