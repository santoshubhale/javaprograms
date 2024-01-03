package com.java.src;

public class ParameterizedConstructor {

	int rollno;
	String name;
	int mobileno;

	ParameterizedConstructor(int r, String n, int m) {
		this.rollno = r;
		this.name=n;
		this.mobileno=m;

	}
	void display(){
		System.out.println(rollno+" "+name+" "+mobileno);
	}

	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor(1, "Happiestmind", 99008899);
		ParameterizedConstructor pc1=new ParameterizedConstructor(2, "santosh", 76769777);
		pc.display();
		pc1.display();
	}

}
