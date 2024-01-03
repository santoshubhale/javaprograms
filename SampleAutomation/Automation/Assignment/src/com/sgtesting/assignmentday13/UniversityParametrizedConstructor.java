package com.sgtesting.assignmentday13;

class University {
	String name;
	int universityno;

	University(String name, int universityno) {
		this.name = name;
		this.universityno = universityno;
		System.out.println("Name :-" + name);
		System.out.println("universityno :-" + universityno);
	}

	String location;

	University(String location) {
		this.location = location;
		System.out.println("------------------");
		System.out.println("location :-" + location);
	}
	int mobileno;
	University(int mobileno){
		this.mobileno=mobileno;
		System.out.println("--------------------");
		System.out.println("mobileno :-"+mobileno);
	}
}

public class UniversityParametrizedConstructor {

	public static void main(String[] args) {
		University u = new University("VTU", 10001);
		University u1= new University("Belgavi");
		University u2=new University(76769777);

	}

}
