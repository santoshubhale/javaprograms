package com.java.src;

public class SuperProgram {
	int id;
	String name ;
	
	 SuperProgram(int id , String name) {
		this.id = id;
		this.name = name;
	}
}
	class Empe extends SuperProgram{
		float salary;
		 Empe(int id ,String name,float salary) {
			super(id,name);
			this.salary=salary;
		}
		 void display() {
			 System.out.println(id+" "+name+" "+salary);
	}
class Testsp{
	public static void main(String[] args) {
		Empe e = new Empe(1, "Santosh", 1000000);
		e.display();
	}
		

	}

}
