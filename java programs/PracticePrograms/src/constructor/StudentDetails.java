package constructor;

class Student {
	String name;
	int age;
	int rollno;
	String address;

	Student(String name, int age, int rollno, String address) {
		
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.address=address;
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);
		System.out.println("Rollno:-"+rollno);
		System.out.println("Address:-"+address);
	}

}

public class StudentDetails {

	public static void main(String[] args) {
		Student s = new Student("Santosh", 27, 01, "Bangalore");

	}

}
