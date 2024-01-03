package com.sgtesting.assignmentday21;

class DemoA {
	DemoA(String name, int age) {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}
}

class DemoB extends DemoA {
	DemoB(String name, int age) {
		super("santosh", 22);
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}

}
class DemoC extends DemoB {
	DemoC() {
		super("darshan", 27);
	}

}

public class Q4MultilevelInheritenceParmeterizedConstructor {

	public static void main(String[] args) {
		DemoC d = new DemoC();

	}

}
