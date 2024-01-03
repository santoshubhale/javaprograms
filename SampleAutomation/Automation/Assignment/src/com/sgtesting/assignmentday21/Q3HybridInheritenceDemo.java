package com.sgtesting.assignmentday21;

class Demo111 {
 void add(int a , int b) {
	 int c= a+b;
	 System.out.println("Addition = "+ c);
 }
}

class Demo222 extends Demo111 {
	void sub(int a , int b) {
		 int c= a-b;
		 System.out.println("Substraction = "+ c);
	 }
}

class Demo333 extends Demo111 {
	void mul(int a , int b) {
		 int c= a*b;
		 System.out.println("Multiplication = "+ c);
	 }

}

class Demo444 extends Demo333 {
	void div(int a , int b) {
		 int c= a/b;
		 System.out.println("Division = "+ c);
	 }

}

public class Q3HybridInheritenceDemo {

	public static void main(String[] args) {
		Demo444 d4 = new Demo444();
		d4.add(10, 20);
		d4.mul(5, 10);
		d4.div(100, 10);
		Demo222 d5 = new Demo222();
		d5.sub(100, 50);
	}

}
