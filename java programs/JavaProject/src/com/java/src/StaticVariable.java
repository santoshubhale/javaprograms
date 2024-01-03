package com.java.src;

public class StaticVariable {
	int id;
	String name;
	static String company = "Happiest minds";

	StaticVariable(int i, String n) {

		this.id = i;
		this.name = n;

	}
	void display() {
		System.out.println(id+" "+name+" "+company);
	}

	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable(1, "santosh");
		sv.display();

	}

}
