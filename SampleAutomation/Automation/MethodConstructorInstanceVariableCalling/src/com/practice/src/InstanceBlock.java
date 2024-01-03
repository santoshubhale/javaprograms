package com.practice.src;
class AA{
	AA(){
		System.out.println("Hello");
	}
	{
		System.out.println("Hi");
	}
	static {
		System.out.println("good moring");
	}
}
class BB{
	static void dis() {
		AA a = new AA();
		System.out.println("Namskari ri paaa");
	}
}
public class InstanceBlock {

	public static void main(String[] args) {
		BB.dis();
		

	}

}
