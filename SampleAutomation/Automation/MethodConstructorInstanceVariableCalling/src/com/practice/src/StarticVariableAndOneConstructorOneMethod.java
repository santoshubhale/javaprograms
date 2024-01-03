package com.practice.src;

class prgm {
	int a = 0;
	static String b = "Santosh";
	char ch ='a';
	prgm(){
		System.out.println(b);
	}
	void show() {
		System.out.println(b);
		
	}
}

public class StarticVariableAndOneConstructorOneMethod {

	public static void main(String[] args) {
		prgm p = new prgm();
		p.show();
		

	}

}
