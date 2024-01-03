package com.sgtesting.noargsconstructor;

class Fruits {
	String fruitsname;
	int price;
	String quntity;
	String quality;

	Fruits() {
		fruitsname = "Mango";
		price = 300;
		quntity = "half kg";
		quality = "Good";
		System.out.println("fruitsname:-" + fruitsname);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);
		System.out.println("********************");
	}

}

class Flowers {
	String flowername;
	int price;
	String quntity;
	String quality;

	Flowers() {
		flowername = "Lotus";
		price = 500;
		quntity = "1/4 kg";
		quality = "better";
		System.out.println("flowername:-" + flowername);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);
		System.out.println("********************");
	}

}

class Vegitables {
	String vegitablename;
	int price;
	String quntity;
	String quality;

	Vegitables() {
		vegitablename = "Tomato";
		price = 100;
		quntity = "2 kg";
		quality = "Good";
		System.out.println("vegitablename:-" + vegitablename);
		System.out.println("price:-" + price);
		System.out.println("quntity:-" + quntity);
		System.out.println("quality:-" + quality);
	}

}

public class Ques5inConstructor {

	public static void main(String[] args) {

		Fruits f = new Fruits();

		Flowers fl = new Flowers();

		Vegitables v = new Vegitables();
	}

}
