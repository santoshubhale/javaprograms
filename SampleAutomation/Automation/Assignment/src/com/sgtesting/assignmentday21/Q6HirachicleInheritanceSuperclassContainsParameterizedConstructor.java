package com.sgtesting.assignmentday21;

class a1 {
	String names;
	int rollno;
	int pincode;

	a1(String name, int r, int cc) {
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a2 extends a1 {
	String names;
	int rollno;
	int pincode;

	a2(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class a3 extends a1 {
	String names ;
	int rollno;
	int pincode;

	a3(String name, int r, int cc) {
		super(name, r, cc);
		names = name;
		rollno = r;
		pincode = cc;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

public class Q6HirachicleInheritanceSuperclassContainsParameterizedConstructor {

	public static void main(String[] args) {

		a2 obj = new a2("Santosh", 804, 560072);
		a3 obj2 = new a3("Darshan", 414, 560017);

	}

}
