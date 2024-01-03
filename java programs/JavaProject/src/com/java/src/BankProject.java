package com.java.src;

public class BankProject {

	int acc_no;
	String Name;
	float Amount;

	void insert(int acn, String n, float amt) {
		this.acc_no = acn;
		this.Name = n;
		this.Amount = amt;
	}

	void deposite(float amt) {
		Amount = Amount + amt;
		System.out.println("Deposite" + amt);
	}

	void withdraw(float amt) {
		if (Amount < amt) {
			System.out.println("Amount is Insufficient ");
		} else {
			Amount = Amount - amt;
			System.out.println("withdraw" + amt);
		}
	}

	void balance() {
		System.out.println("Balance" + Amount);
	}

	void display() {
		System.out.println(acc_no + " " + Name + " " + Amount);
	}

	
}
