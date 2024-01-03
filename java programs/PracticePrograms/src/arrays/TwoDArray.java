package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		double a[][] = { { 1.5, 2.1, 3.6 }, { 3.4, 4.2, 5.7 } };

		for (double x[] : a) {
			for (double y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
