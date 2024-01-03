package MethodArraysCombined;

class Reverseprogram {
// write a program to read the elements from the single dimensional array in reverse order 
	public void reverse(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}

public class ReverseOrder {

	public static void main(String[] args) {
		Reverseprogram rp = new Reverseprogram();
		rp.reverse(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

	}

}
