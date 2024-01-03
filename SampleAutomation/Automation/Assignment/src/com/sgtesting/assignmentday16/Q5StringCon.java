package com.sgtesting.assignmentday16;

class StringDemo{
	String arr(String  s[][]) {
		String str = " " ;
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				str=str+s[i][j];
			}
		}
		return str;
	}
}

public class Q5StringCon {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		String ss [][]= {{"apple","ball","cat"},{"dog","elephant","fish"},{"got","hat","ink"}};
		String a=sd.arr(ss);
		System.out.println(a);
		

	}

}
