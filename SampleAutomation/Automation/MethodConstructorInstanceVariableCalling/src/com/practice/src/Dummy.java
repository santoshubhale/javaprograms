package com.practice.src;

class Aero {
	int a=10;
	static String s="Santosh";
	Aero(){
		
		System.out.println("I am class 2 variable = "+Aero2.aa);
		System.out.println("I am class 2 variable = "+Aero2.bb);
	}
}
class Aero2{
	static int aa=11;
	static byte bb=22;
	
	static void show() {
		Aero az = new Aero();
		System.out.println("I am class 1 variable = "+az.a);
		System.out.println("I am class 1 variable = "+Aero.s);
	}
	
}
public class Dummy {

	public static void main(String[] args) {
		
		Aero2.show();
		
		
		
	}

}
