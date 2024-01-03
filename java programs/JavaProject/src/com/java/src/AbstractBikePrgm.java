package com.java.src;

abstract class AbstractBikePrgm {
	
	AbstractBikePrgm() {
		System.out.println("Bike Running");
	}
	abstract void run();
	
	void gearchange() {
		System.out.println("Gear Changed");
}
}
class Bike extends AbstractBikePrgm{
	void run() {
		System.out.println("Bike is Started");
	}
}
class TestAbstractBikePrgm{
	public static void main(String[] args) {
		AbstractBikePrgm abp = new Bike();
		abp.run();
		abp.gearchange();
		
		
		

	}

}
