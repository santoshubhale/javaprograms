package constructor;

class Employee {
	String name;
	int age;
	double salary;
	String address;

	Employee() {

		name = "santosh";
		age = 27;
		salary = 1000000.00;
		address = "Bangalore";
		System.out.println("Name:-" + name);
		System.out.println("Age:-" + age);
		System.out.println("Salary:-" + salary);
		System.out.println("Address:-" + address);

	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e = new Employee();

	}

}
