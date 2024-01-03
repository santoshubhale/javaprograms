package com.sgtesting.noargsconstructor;

class Student {

	String studentname;
	String fathername;
	int age;
	String location;

	Student() {
		studentname = "Santosh";
		fathername = "Vishwanath";
		age = 27;
		location = "pune";
		System.out.println("studentname:-" + studentname);
		System.out.println("fathername:-" + fathername);
		System.out.println("age:-" + age);
		System.out.println("location:-" + location);
		System.out.println("-----------------");
	}

}

class Library {
	int libraryid;
	String issueddate;
	String reciveddate;
	String fine;

	Library() {
		libraryid = 101;
		issueddate = "12/10/2022";
		reciveddate = "22/11/2023";
		fine = "100/-Rs";
		System.out.println("libraryid:-" + libraryid);
		System.out.println("issueddate:-" + issueddate);
		System.out.println("reciveddate:-" + reciveddate);
		System.out.println("fine:-" + fine);
		System.out.println("-----------------");
	}

}

class Sports {
	int sportid;
	String Sporttype;
	String winnerteam;

	Sports() {
		sportid = 111;
		Sporttype = "cricket";
		winnerteam = "tigerboys";
		System.out.println("sportid:-" + sportid);
		System.out.println("Sporttype:-" + Sporttype);
		System.out.println("winnerteam:-" + winnerteam);
		System.out.println("-----------------");
	}

}

class ComputerScienceDept {
	String subjectname;
	int Subjectid;
	String deptblock;
	int numberoffaculties;

	ComputerScienceDept() {
		subjectname = "java";
		Subjectid = 11;
		deptblock = "4th block";
		numberoffaculties = 11;
		System.out.println("subjectname:-" + subjectname);
		System.out.println("Subjectid:-" + Subjectid);
		System.out.println("deptblock:-" + deptblock);
		System.out.println("numberoffaculties:-" + numberoffaculties);
	}
}

public class Ques3inConstructor {

	public static void main(String[] args) {

		Student s = new Student();

		Library l = new Library();

		Sports sp = new Sports();

		ComputerScienceDept cs = new ComputerScienceDept();

	}

}
