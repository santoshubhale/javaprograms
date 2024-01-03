package ConstructorAssignment;

import java.util.Arrays;
// WAM to findout that the given no is the result of addition of 2 element from the array
class Addition {

	public void add(int a[] , int b[]) {
		int sum[] = new int[a[].length];
		if (a[].length == b.length) {
			for (int i = 0; i < a[].length; i++) {
				sum[i] = a [i] + b[i];
			}
			System.out.println(Arrays.toString(sum));

		} else {
			System.out.println("size of the array is matching please check it");
		}

	}
}

public class MethodAddition {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 11, 12, 13, 14, 15, 16 };
		Addition add = new Addition();
		add.add(a, b);

	}
}
