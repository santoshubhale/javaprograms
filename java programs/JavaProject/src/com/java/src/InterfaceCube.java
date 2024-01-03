package com.java.src;

interface InterfaceCube {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}
	class Interface implements InterfaceCube {
		public void draw() {
			System.out.println("Hi Bangalore");
		}
	}

	class TestInterface12 {

		public static void main(String[] args) {
			InterfaceCube ti = new Interface();
			ti.draw();
			System.out.println(InterfaceCube.cube(3));

		}

	}

