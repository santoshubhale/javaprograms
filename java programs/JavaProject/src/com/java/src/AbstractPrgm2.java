package com.java.src;

abstract class AbstractPrgm2 {
	abstract void draw();
}
	class Rectangle extends AbstractPrgm2 {
		void draw() {
			System.out.println("Rectangle is Drawing");
		}
	}

	class circle extends AbstractPrgm2 {
		void draw() {
			System.out.println("Circle is drawing");
		}
	}

	class TestAbstract {

		public static void main(String[] args) {
			AbstractPrgm2 a = new Rectangle();
			AbstractPrgm2 a1 = new circle();
			a.draw();
			a1.draw();

		}

	}
