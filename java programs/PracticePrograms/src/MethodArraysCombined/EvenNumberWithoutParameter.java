package MethodArraysCombined;

class EvenNumber {
	public void even() {
		int arr[] = new int[10];
		int x = 0;
		for (int i = 1; i <= 20; i++) {
			if ((i % 2) == 0) {

				arr[x] = i;
				x++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}

public class EvenNumberWithoutParameter {

	public static void main(String[] args) {
		EvenNumber en = new EvenNumber();
		en.even();

	}

}
