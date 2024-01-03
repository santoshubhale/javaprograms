package com.sgtesting.assignmentday21;

class Demo1 {
	void student(String name, int age) {
		System.out.println("Name = " + name + "," + "Age = " + age);
	}
}

class Demo2 extends Demo1 {
	void college(String CollegeName, String location) {
		System.out.println("College name = " + CollegeName + "," + "Location = " + location);
	}
}

class Demo3 extends Demo2 {
	void department(String departmentName, int departmentCode) {
		System.out.println("DepartmentName = " + departmentName + "," + "DepartmentCode = " + departmentCode);
	}

}

public class Q1MultilevelInheritenceDemo {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.student("Santosh", 27);
		d.college("Sg Testing", "Vijaynagar");
		d.department("Information Technology", 1101);
	}

}
