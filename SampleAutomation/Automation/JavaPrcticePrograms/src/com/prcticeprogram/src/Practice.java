package com.prcticeprogram.src;

class Person{
	{
		System.out.println("Instance block");
	}
	Person(){
		System.out.println("No args constructor");
	}
}
public class Practice {

	public static void main(String[] args) {
		Person p = new Person();

	}
}
