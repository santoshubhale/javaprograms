package com.java.src;

public class InheritanceProgram {

	float salary = 100000;
}

class Employee extends InheritanceProgram {
	String name = "Santosh";

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println(e.name);
		System.out.println(e.salary);

	}

}
