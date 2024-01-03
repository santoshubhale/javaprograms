package com.methods;

class Person {
	String name(String n) {
		String s = n;
		return s;
	}

	int age(int a) {
		int a1 = a;
		return a1;
	}
	
	String[] hobbies(String a[]) {
		return a;
	}
}

public class MethodDemo1 {

	public static void main(String[] args) {
		Person p = new Person();
		String ss = p.name("Santosh");
		System.out.println(ss);
		int a=p.age(27);
		System.out.println(27);
		String str[]= {"Santosh","from","Gulbarga","Karnataka"};
		String [] s = p.hobbies(str);
		for(String i : s) {
			System.out.print(i+" , ");
		}

	}

}
