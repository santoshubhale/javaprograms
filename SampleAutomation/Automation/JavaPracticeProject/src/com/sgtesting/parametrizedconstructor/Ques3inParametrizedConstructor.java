package com.sgtesting.parametrizedconstructor;

class Student {

	String studentname;
	String fathername;
	int age;
	String location;

	Student(String Studentname,String Fathername,int Age,String Location) {
		studentname = Studentname;
		fathername = Fathername;
		age = Age;
		location = Location;
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

	Library(int Libraryid,String Issueddate,String Reciveddate,String Fine) {
		libraryid = Libraryid;
		issueddate = Issueddate;
		reciveddate = Reciveddate;
		fine = Fine;
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

	Sports(int Sportid,String sporttype,String Winnerteam) {
		sportid = Sportid;
		Sporttype = sporttype;
		winnerteam = Winnerteam;
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

	ComputerScienceDept(String Subjectname,int subjectid,String Deptblock,int Numberoffaculties) {
		subjectname = Subjectname;
		Subjectid = subjectid;
		deptblock = Deptblock;
		numberoffaculties = Numberoffaculties;
		System.out.println("subjectname:-" + subjectname);
		System.out.println("Subjectid:-" + Subjectid);
		System.out.println("deptblock:-" + deptblock);
		System.out.println("numberoffaculties:-" + numberoffaculties);
	}
}

public class Ques3inParametrizedConstructor {

	public static void main(String[] args) {
		Student s = new Student("Santosh", "Vishwanath", 420, "Mumbai");

		Library l = new Library(101,"12/10/2022","22/11/2023","100/-Rs");

		Sports sp = new Sports(111,"cricket","tigerboys");

		ComputerScienceDept cs = new ComputerScienceDept("java",1001,"4th block",11);

	}

}
