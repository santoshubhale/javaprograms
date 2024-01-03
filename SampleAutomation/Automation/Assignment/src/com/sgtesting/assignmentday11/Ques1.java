package com.sgtesting.assignmentday11;

class Employee {
	String name;
	int age;
	String address;
	long mobileno;
}

class Department {
	String deptname;
	String location;
	int deptid;
	String deptblock;

}

class insurance {
	String insurancename;
	String insurancetype;
	int policynumber;
	
 }

public class Ques1 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Santosh";
		e.age=27;
		e.address="Bangalore";
		e.mobileno=767697779;
		System.out.println("Name:-"+e.name);
		System.out.println("Age:-"+e.age);
		System.out.println("Address:-"+e.address);
		System.out.println("Mobile:-"+e.mobileno);
		System.out.println("-------------------------");
		Department d = new Department();
		d.deptname="Tech dept";
		d.location="Mumbai";
		d.deptid=701;
		d.deptblock="4th block";
		System.out.println("Deptname:-"+d.deptname);
		System.out.println("Locationg:-"+d.location);
		System.out.println("DeptId:-"+d.deptid);
		System.out.println("DeptBlock"+d.deptblock);
		System.out.println("------------------------");
		insurance i = new insurance();
		i.insurancename="Jeevansathi";
		i.insurancetype="Life Insurance";
		i.policynumber=101202;
		System.out.println("Insurancename:-"+i.insurancename);
		System.out.println("Insurancetype:-"+i.insurancetype);
		System.out.println("Policynumber:-"+i.policynumber);
	}

}
