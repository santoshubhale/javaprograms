package com.sgtesting.assignmentday11;

class Fruits {
	String fruitsname;
	int price;
	String quntity;
	String quality;

}

class Flowers {
	String flowername;
	int price;
	String quntity;
	String quality;

}

class Vegitables {
	String vegitablename;
	int price;
	String quntity;
	String quality;

}

public class Ques5 {

	public static void main(String[] args) {

		Fruits f = new Fruits();
		f.fruitsname = "Mango";
		f.price = 300;
		f.quntity = "half kg";
		f.quality = "Good";
		System.out.println("fruitsname:-" + f.fruitsname);
		System.out.println("price:-" + f.price);
		System.out.println("quntity:-" + f.quntity);
		System.out.println("quality:-" + f.quality);
		System.out.println("********************");
		Flowers fl = new Flowers();
		fl.flowername = "Lotus";
		fl.price = 500;
		fl.quntity = "1/4 kg";
		fl.quality = "better";
		System.out.println("flowername:-" + f.fruitsname);
		System.out.println("price:-" + fl.price);
		System.out.println("quntity:-" + fl.quntity);
		System.out.println("quality:-" + fl.quality);
		System.out.println("********************");
		Vegitables v = new Vegitables();
		v.vegitablename = "Tomato";
		v.price = 100;
		v.quntity = "2 kg";
		v.quality = "Good";
		System.out.println("vegitablename:-" + v.vegitablename);
		System.out.println("price:-" + v.price);
		System.out.println("quntity:-" + v.quntity);
		System.out.println("quality:-" + v.quality);

	}

}
