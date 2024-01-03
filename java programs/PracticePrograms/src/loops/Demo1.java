package loops;

public class Demo1 {

	public static void main(String[] args) {
		int i ;
		int x=0;
		for ( i = 100; i <= 200; i++) {

			if ((i % 3) == 0) {

				x++;
			}
		}
		
		System.out.println(x);

	}
}