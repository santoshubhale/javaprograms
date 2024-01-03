package arrayprogram;

public class EightTable {
// Programmatically Assign result of 8th table one-d array read first half of the element  
	public static void main(String[] args) {
		
		
		int arr[] = new int[10];
		int a = 0;
		for (int j = 1; j <= 10; j++) {

			arr[a] = j;
			a++;
		}
		for (int c = 0; c < arr.length / 2; c++) {

			System.out.println("8" + "*" + arr[c] + "=" + arr[c] * 8);

		}

	}
}