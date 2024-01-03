package com.methods;
class Demo121{
	char [] arr(char a[]) {
		char k[] =new char [a.length];
		for(int i=0; i<a.length; i++) {
			k[i]=a[i];
		}
		return k;
	}
}

public class CharecterReturn {

	public static void main(String[] args) {
		Demo121 c = new Demo121();
		char x []= {'a','b','c','d'};
		char res[]=c.arr(x);
		for(char r : res) {
			System.out.println(r);
		}
		

	}

}
