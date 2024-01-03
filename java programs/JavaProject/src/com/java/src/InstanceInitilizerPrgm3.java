package com.java.src;

public class InstanceInitilizerPrgm3 {
InstanceInitilizerPrgm3(){
	System.out.println("parent class constructor invoked");
}
}
class B extends InstanceInitilizerPrgm3{
	B(){
		super();
		System.out.println("Child class constructor invoked");
	}
	{
		System.out.println("Instance initializer block invoked");
	}
	
	public static void main(String[] args) {
		B ii = new B();
		
	}

}
/*o/p:-
  parent class constructor invoked
Instance initializer block invoked
Child class constructor invoked*/
