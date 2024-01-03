package com.sgtesting.assinmentday25;

interface Lion {
	void lion();
}

interface Tiger extends Lion {
	void tiger();
}

interface Cow extends Lion {
	void cow();
}

class Animal implements Cow, Tiger {

	public void lion() {
		System.out.println("I am Lion ");

	}

	public void cow() {
		System.out.println("I am Cow");

	}

	public void tiger() {
		System.out.println("I am Tiger");

	}

}

public class Q4OneInterfaceExtendsAnotherinHirachicle {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.lion();
		a.cow();
		a.tiger();

	}

}
