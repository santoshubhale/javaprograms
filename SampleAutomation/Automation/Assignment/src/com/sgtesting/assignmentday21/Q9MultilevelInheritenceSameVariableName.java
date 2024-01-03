package com.sgtesting.assignmentday21;

class Country {
	String name;

	void show() {
		System.out.println("I am grand parent class name=" + name);
	}
}

class State extends Country {
	String name;

	State(String name, String name1) {
		super.name = name;
		this.name = name1;

	}

	void display() {
		System.out.println("I am parent class name=" + name);
	}

}

class District extends State {
	String name;

	District(String name, String name1, String name2) {
		super(name, name1);
		this.name = name2;

	}

	void dis() {
		System.out.println("I am child class name=" + name);
	}

}

public class Q9MultilevelInheritenceSameVariableName {

	public static void main(String[] args) {
		District d = new District("India", "karnataka", "Gulbarga");
		d.show();
		d.display();
		d.dis();

	}

}
