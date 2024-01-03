package com.sgtesting.assignmentday23;


abstract class Employee {
	Employee(String name, int age) {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}

}

class Employee1 extends Employee {
	String name1;
	int id;

	Employee1(String name, int age, String name1, int id) {
		super(name, age);
		System.out.println("Name = " + name1);
		System.out.println("Id = " + id);

	}

}

class Employee2 extends Employee {
	String name2;
	int sallery;

	Employee2(String name, int age, String name2, int sallery) {
		super(name, age);
		System.out.println("Name = " + name2);
		System.out.println("Sallery = " + sallery);
	}

}

class Employee3 extends Employee2 {
	String name3;
	int code;

	Employee3(String name, int age, String name2, int sallery, String name3, int code) {
		super(name, age, name2, sallery);
		System.out.println("Name = " + name3);
		System.out.println("code = " + code);
	}

}



public class Q5SubClassExecuteAllMethod {

	public static void main(String[] args) {
		Employee2 r = new Employee2("Santosh", 27, "Ubhale", 20000);
		
		Employee3 r1 = new Employee3("Darshan", 22, "ubhale", 5000, "Suhas", 77777);
	

	}

}
