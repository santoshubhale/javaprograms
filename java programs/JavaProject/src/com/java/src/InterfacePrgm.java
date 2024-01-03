package com.java.src;

public interface InterfacePrgm {
	
	void print();

}
class TestInterface implements InterfacePrgm{
	@Override
	public void print() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.print();
	}
	
}
