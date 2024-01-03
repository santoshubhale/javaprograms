package Testing;

import java.util.Arrays;

public class CopyOneArraytoAnotherArray {

	// copy one array to another array
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 89 };
		int a[] = array;
		System.out.println(Arrays.toString(a));

		int b[] = array.clone();
		System.out.println(Arrays.toString(b));

		int c[] = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(c));

		int d[] =new int[array.length];
		for(int i=0; i<d.length; i++) {
			d[i]=array[i];
		}
		System.out.println(Arrays.toString(d));
		}
	}


