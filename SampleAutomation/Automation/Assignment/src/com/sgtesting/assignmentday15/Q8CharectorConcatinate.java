package com.sgtesting.assignmentday15;
class CharConDemo{
	void charCon(char c[][]) {
		String ch=" ";
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				 ch =  ch+c[i][j];
			}
			
		}
		System.out.print(ch+" ");
	}
}

public class Q8CharectorConcatinate {

	public static void main(String[] args) {
		CharConDemo cc = new CharConDemo();
		char a[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		cc.charCon(a);
	}

}
