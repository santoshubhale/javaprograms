package com.sgtesting.src;

public class ImplicitTC {

	public static void main(String[] args) {
		short s = 10000;
		byte b = (byte)s;
		System.out.println(b);
		
		long l = 199999887;
		int i = (int)l;
		System.out.println(i);
		
		int a = 'j';
		char c = (char) a;
		System.out.println(c);

	}

}
