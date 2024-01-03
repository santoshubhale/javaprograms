package method;
//WAM to add array?

class Add {
	public void demo(int arr1[], int arr2[]) {
		int sum[] = new int[arr1.length];

		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {

				int sum1 = arr1[i] + arr2[i];

				System.out.print(sum1+" ");
			}

		} else {
			System.out.println("Cann't Addition this program");
		}

	}
}

public class AddArray {

	public static void main(String[] args) {
		Add a = new Add();
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 1 };
		a.demo(arr1, arr2);

	}

}
