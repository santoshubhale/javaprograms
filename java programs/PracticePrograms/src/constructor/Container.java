package constructor;

import java.util.Arrays;

class Demo1 {

	Demo1(int a[], int b[]) {

		int arr1 = a.length;
		int arr2 = b.length;

		int arr3[] = new int[arr1 + arr2];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			arr3[k] = a[i];
			k = k + 1;
		}

		for (int j = 0; j < b.length; j++) {
			arr3[k] = b[j];
			k = k + 1;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
			}

		}
		System.out.println(Arrays.toString(arr3));

	}
}

public class Container {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 10, 20, 30, 40, 50, 60 };
		Demo1 d = new Demo1(a, b);

	}

}
