package com.java.src;

public class Demo extends Emp{
 int id ;
 String name;
}
class Emp{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.id=20;
		d.name="Suhas";
		Demo d1 = new Demo();
		d1.id=12;
		d1.name="Darshan";
		System.out.println(d.id + " "+ d.name);
		System.out.println(d1.id + " "+ d1.name);

	}

}
