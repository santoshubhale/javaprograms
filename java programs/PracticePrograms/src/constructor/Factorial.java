package constructor;

class Sample {
	Sample(int a) {
		
		int x = 1;
		for (int i = 1; i <= a; i++) {
			x = x * i;
		}
		System.out.println(x);

	}
}

public class Factorial {

	public static void main(String[] args) {
		Sample s = new Sample(4);

	}

}
