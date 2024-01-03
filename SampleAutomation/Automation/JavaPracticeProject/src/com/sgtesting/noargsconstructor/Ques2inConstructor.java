package com.sgtesting.noargsconstructor;

class Product {
	String productname;
	int productid;
	String producttype;
	String number;

	Product() {
		productname = "Vivo";
		productid = 220022;
		producttype = "Mobile";
		number = "1ee12345jj990022";
		System.out.println("productname:-" + productname);
		System.out.println("productid:-" + productid);
		System.out.println("producttype:-" + producttype);
		System.out.println("number:-" + number);
		System.out.println("-------------------");
	}
}
class Order {
	String ordertype;
	String location;
	int orderid;
	String orderreachdate;
	Order(){
		ordertype = "online";
		location = "pune";
		orderreachdate = "07/11/2023";
		orderid = 124;
		System.out.println("ordertype:-" + ordertype);
		System.out.println("location:-" + location);
		System.out.println("orderreachdate:-" + orderreachdate);
		System.out.println("orderid:-" + orderid);
		System.out.println("-----------------------");
	}

}

class Items {
	String itemname;
	int itemnumber;
	String itemtype;
	String itemreciveddate;
	Items(){
		itemname = "Mobile";
		itemnumber = 1000;
		itemreciveddate = "10/10/2020";
		itemtype = "Vivo";
		System.out.println("itemname:-" + itemname);
		System.out.println("itemnumber:-" + itemnumber);
		System.out.println("itemreciveddate:-" + itemreciveddate);
		System.out.println("itemtype:-" + itemtype);
	}

}

public class Ques2inConstructor {
	public static void main(String[] args) {
		Product p = new Product();
		Order o = new Order();
		Items i = new Items();
	}

}
