package com.java.src;

public class SingleLevelinheritancePrgm {

	void eat() {
		System.out.println("Eating..");
	}
}
	class SingleLevelinheritancePrgm2 extends SingleLevelinheritancePrgm {
		void drink() {
			System.out.println("Drinking...");
		}

		public static void main(String[] args) {
			SingleLevelinheritancePrgm2 slip = new SingleLevelinheritancePrgm2();
			slip.eat();
			slip.drink();

		}
	}


