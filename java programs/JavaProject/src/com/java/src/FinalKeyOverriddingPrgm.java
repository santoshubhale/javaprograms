package com.java.src;

public class FinalKeyOverriddingPrgm {
	
	final void FinalKeyOverriddingPrgm() {
		System.out.println("Hi i am Final");
	}
}
	class FinalTest2 extends FinalKeyOverriddingPrgm{
		
	void FinalKeyOverriddingPrgm() {
		System.out.println("I am try to overridde");
	}

	public static void main(String[] args) {
		FinalKeyOverriddingPrgm fk = new FinalKeyOverriddingPrgm();

	}

}
