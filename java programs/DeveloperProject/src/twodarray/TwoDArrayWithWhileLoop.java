package twodarray;

public class TwoDArrayWithWhileLoop {
// create 2-d byte array using while loop
	public static void main(String[] args) {

		byte array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int i = 0;
		while (i < array.length) {
			int j = 0;
			while (j < array[i].length) {
				System.out.print(array[i][j]+" ");
				j++;
			}

			System.out.println();
			i++;
		}

	}

}
