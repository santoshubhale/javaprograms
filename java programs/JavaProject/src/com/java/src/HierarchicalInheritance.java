package com.java.src;

public class HierarchicalInheritance {
	void dog() {
		System.out.println("dogs is a good animal");

	}
}

class HierarchicalInheritance2 extends HierarchicalInheritance {
	void cat() {
		System.out.println("cat is a good animal");
	}

}

class HierarchicalInheritance3 extends HierarchicalInheritance {
	void tiger() {
		System.out.println("tiger is national animal");
	}

}
class TestHI{
	
	public static void main(String[] args) {
		HierarchicalInheritance3 hi = new HierarchicalInheritance3();
		hi.dog();
		hi.cat();
		hi.tiger();
	}

}
