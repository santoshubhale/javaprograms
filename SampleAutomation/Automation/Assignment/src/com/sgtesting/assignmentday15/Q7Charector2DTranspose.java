package com.sgtesting.assignmentday15;
class ArrayDemo{
	void arraychar(char a[][]) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
public class Q7Charector2DTranspose {

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		char ch[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		ad.arraychar(ch);

	}

}
