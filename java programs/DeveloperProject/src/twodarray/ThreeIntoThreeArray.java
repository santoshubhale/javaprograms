package twodarray;

public class ThreeIntoThreeArray {
//create 3*3 integer array
	//read 2nd rows of elements alone
	//read 2nd column of the element alone
	public static void main(String[] args) {
		int x[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println("First rows:-");
		for (int i = 1; i < x.length - 1; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("Second column");
		for (int i = 0; i < x.length; i++) {
			for (int j = 1; j < x[i].length - 1; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}

	}
}