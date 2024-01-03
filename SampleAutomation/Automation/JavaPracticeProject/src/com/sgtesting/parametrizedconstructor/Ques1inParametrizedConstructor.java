package com.sgtesting.parametrizedconstructor;


class Employee {
	String name;
	int age;
	String address;
	long mobileno;

	Employee(String Name, int Age, String Address, long Phone) {
		name = Name;
		age = Age;
		address = Address;
		mobileno = Phone;
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

	Department(String Deptname,String Location,int Deptid,String Deptblock) {
		deptname = Deptname;
		location = Location;
		deptid = Deptid;
		deptblock = "Deptblock";
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

	Insurance(String Insurancename,String Insurancetype,int Policynumber) {
		insurancename = Insurancename;
		insurancetype = Insurancetype;
		policynumber = Policynumber;
		System.out.println("Insurancename:-" + insurancename);
		System.out.println("Insurancetype:-" + insurancetype);
		System.out.println("Policynumber:-" + policynumber);
	}
}



public class Ques1inParametrizedConstructor {

	public static void main(String[] args) {
		Employee e = new Employee("Santosh", 27, "Gulbarga", 76767);
		Department d = new Department("Hr", "Bangalore", 110, "7th Block");
		Insurance i = new Insurance("Jeevansathi", "life insurance", 110022);
		

	}

}
