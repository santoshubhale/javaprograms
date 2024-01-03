package com.sgtesting.assignmentday21;

class Demo11 {
	void rbi(String location, int interest) {
		System.out.println("Location = " + location + " , " + "Interest Rate = " + interest);
	}
}

class Demo22 extends Demo11 {
	void sbi(String loanName, int rateOfInterest) {
		System.out.println("Loan name = " + loanName + " , " + "Rate Of Interest = " + rateOfInterest);
	}

}

class Demo33 extends Demo11 {
	void hdfc(String loanName, int rateOfInterest) {
		System.out.println("Loan name = " + loanName + " , " + "Rate Of Interest = " + rateOfInterest);
	}

}

public class Q2HyrachicalInheritanceDemo {

	public static void main(String[] args) {
		Demo33 d = new Demo33();
		d.rbi("Mumbai", 12);
		d.hdfc("Bangalore", 10);
		Demo22 d1 = new Demo22();
		d1.sbi("Pune", 9);

	}

}
