package com.sgtesting.assignmentday11;

class Student {

	String studentname;
	String fathername;
	int age;
	String location;

}

class Library {
	int libraryid;
	String issueddate;
	String reciveddate;
	String fine;

}

class Sports {
	int sportid;
	String Sporttype;
	String winnerteam;

}

class ComputerScienceDept {
	String subjectname;
	int Subjectid;
	String deptblock;
	int numberoffaculties;

}

public class Ques3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.studentname = "Santosh";
		s.fathername = "Vishwanath";
		s.age = 27;
		s.location = "pune";
		System.out.println("studentname:-" + s.studentname);
		System.out.println("fathername:-" + s.fathername);
		System.out.println("age:-" + s.age);
		System.out.println("location:-" + s.location);
		System.out.println("-----------------");
		Library l = new Library();
		l.libraryid = 101;
		l.issueddate = "12/10/2022";
		l.reciveddate = "22/11/2023";
		l.fine = "100/-Rs";
		System.out.println("libraryid:-" + l.libraryid);
		System.out.println("issueddate:-" + l.issueddate);
		System.out.println("reciveddate:-" + l.reciveddate);
		System.out.println("fine:-" + l.fine);
		System.out.println("-----------------");
		Sports sp = new Sports();
		sp.sportid = 111;
		sp.Sporttype = "cricket";
		sp.winnerteam = "tigerboys";
		System.out.println("sportid:-" + sp.sportid);
		System.out.println("Sporttype:-" + sp.Sporttype);
		System.out.println("winnerteam:-" + sp.winnerteam);
		System.out.println("-----------------");
		ComputerScienceDept cs = new ComputerScienceDept();
		cs.subjectname = "java";
		cs.Subjectid = 11;
		cs.deptblock = "4th block";
		cs.numberoffaculties = 11;
		System.out.println("subjectname:-" + cs.subjectname);
		System.out.println("Subjectid:-" + cs.Subjectid);
		System.out.println("deptblock:-" + cs.deptblock);
		System.out.println("numberoffaculties:-" + cs.numberoffaculties);

	}

}
