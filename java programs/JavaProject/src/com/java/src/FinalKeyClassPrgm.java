package com.java.src;

final class FinalKeyClassPrgm {
	int i;

	FinalKeyClassPrgm(int i) {
		this.i = i;
	}
}

class FinalTest extends FinalKeyClassPrgm {
	public static void main(String[] args) {
		FinalKeyClassPrgm fk = new FinalKeyClassPrgm(10);

	}

}
