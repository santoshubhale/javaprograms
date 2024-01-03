package oopsconcept;

public class ClassProgram {
	//Instance variable
	String name;
	int age;
	int salary;

	public static void main(String[] args) {
		// Human 
		ClassProgram cp = new ClassProgram();
		cp.age=26;
		cp.name="santosh";
		cp.salary=100000000;
		System.out.println(cp.age);
		System.out.println(cp.name);
		System.out.println(cp.salary);
		System.out.println("---------------");
		ClassProgram cp1 = new ClassProgram();
		cp1.age=30;
		cp1.name="Bangalore";
		cp1.salary=1111111111;
		System.out.println(cp1.age);
		System.out.println(cp1.name);
		System.out.println(cp1.salary);
		

	}

}
