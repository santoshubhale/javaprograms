package com.java.src;
class Constructor  {
	public int i;
	public String name;
	public long mobileno;

	protected Constructor(int i, String n, long m) {
		this.i = i;
		name = n;
		mobileno = m;
		System.out.println("hi i am Constructor");
	}

	public void display() {
		System.out.println(name);
		System.out.println(mobileno);
		System.out.println(i);
	}

}
public class Constructor1 {

	public static void main(String[] args) {

		Constructor c = new Constructor(10, "santosh", 989878767);
		Constructor c1 = new Constructor(2, "santu", 709784930);
		c.display();
		c1.display();
	}
}

