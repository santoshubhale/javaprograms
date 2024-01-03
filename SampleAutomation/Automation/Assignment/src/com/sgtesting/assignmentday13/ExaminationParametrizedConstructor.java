package com.sgtesting.assignmentday13;

class Examination {

	Examination(String center, int rollno) {
		System.out.println("Center:-" + center);
		System.out.println("RollNo:-" + rollno);
		System.out.println("--------------------");
	}
	Examination ( int roomno, int floor){
		System.out.println("Room no :-"+roomno);
		System.out.println("Floor:-"+floor);
		System.out.println("---------------------");
	}
	Examination(String examminername){
		System.out.println("Examminername :-"+examminername);
	}
}

public class ExaminationParametrizedConstructor {

	public static void main(String[] args) {
		Examination e = new Examination("Vijaynagar", 10);
		Examination e1 = new Examination(2, 1);
		Examination e2 = new Examination("Santosh");

	}

}
