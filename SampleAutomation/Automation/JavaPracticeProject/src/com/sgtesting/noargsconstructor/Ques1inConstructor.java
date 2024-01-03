package com.sgtesting.noargsconstructor;

class Employee {
	String name;
	int age;
	String address;
	long mobileno;

	Employee() {
		name = "Santosh";
		age = 27;
		address = "Bangalore";
		mobileno = 767697779;
		System.out.println("Name:-" + name);
		System.out.println("Age:-" + age);
		System.out.println("Address:-" + address);
		System.out.println("Mobile:-" + mobileno);
		System.out.println("--------------------");
	}
}

class Department {
	String deptname;
	String location;
	int deptid;
	String deptblock;

	Department() {
		deptname = "Tech dept";
		location = "Mumbai";
		deptid = 701;
		deptblock = "4th block";
		System.out.println("Deptname:-" + deptname);
		System.out.println("Locationg:-" + location);
		System.out.println("DeptId:-" + deptid);
		System.out.println("DeptBlock" + deptblock);
		System.out.println("------------------------");
	}
}

class Insurance {
	String insurancename;
	String insurancetype;
	int policynumber;

	Insurance() {
		insurancename = "Jeevansathi";
		insurancetype = "Life Insurance";
		policynumber = 101202;
		System.out.println("Insurancename:-" + insurancename);
		System.out.println("Insurancetype:-" + insurancetype);
		System.out.println("Policynumber:-" + policynumber);
	}
}

public class Ques1inConstructor {

	public static void main(String[] args) {
		Employee e = new Employee();
		Department d = new Department();
		Insurance i = new Insurance();

	}

}
