package com.sgtesting.assignmentday23;

abstract class State
{
	void state(String name,int code)
	{
		System.out.println("Name = "+name);
		System.out.println("Code = "+code);
	}
}
class District extends State
{
	
}



public class Q6InstanceMethodDemo {

	public static void main(String[] args) {
		
		District d=new District();
		d.state("Gulbarga", 10);

	}

}
