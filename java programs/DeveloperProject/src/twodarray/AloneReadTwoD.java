package twodarray;

public class AloneReadTwoD {
// create 2-d array 3*3 character array
	// 1. read first rows of element alone
	// 2.read first columns of element alone

	public static void main(String[] args) {
		char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		System.out.println("First rows:-");
		for(int i=1; i<ch.length-1; i++) {
			for(int j=0; j<ch[i].length;j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("Second column");
		for(int i=0; i<ch.length; i++) {
			for(int j=1; j<ch[i].length-1;j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

}
