package com.sgtesting.assignmentday15;

class StringDemo{
	void StrCon(String str[][] ) {
		String st = " ";
		for(int i=0; i<str.length; i++) {
			st=st+str[2][i];
		}
		System.out.println(st+" ");
	}
}

public class Q11StringArrayCon3rdRow {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		String s[][] = {{"apple","ball","cat"},{"dog","elephant","fish"},{"got","hat","ice"}};
		sd.StrCon(s);

	}

}
