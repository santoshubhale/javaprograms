package com.sgtesting.assignmentday21;

class Companie {
	void showname(String companyname) {
		System.out.println("company name:" + companyname);
	}
}

class Recruiter extends Companie {
	Recruiter(String recruitingcomp) {
		super.showname(recruitingcomp);
	}

	void showname(String recruitingcompany) {
		System.out.println("company name in sub class:" + recruitingcompany);
	}
}

class Employes extends Recruiter {
	Employes(String name) {
		super(name);
		super.showname(name);
	}

	void showname(String employeename) {
		System.out.println("Employee name is :" + employeename);
	}
}

public class Q8HybridInheritanceSuperClassConstructorOverloading {

	public static void main(String[] args) {
		Employes obj = new Employes("Amazon");
		obj.showname("Santosh");

	}

}
