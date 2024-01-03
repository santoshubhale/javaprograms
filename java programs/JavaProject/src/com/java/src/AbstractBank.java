package com.java.src;

abstract class AbstractBank {
	abstract int RateOfInterest();
}

class Sbi extends AbstractBank {

	int RateOfInterest() {
		return 7;
	}
}
	class Hdfc extends AbstractBank {
		int RateOfInterest() {
			return 8;
		}
	}

	class AbstractBankTest {
		public static void main(String[] args) {
			AbstractBank ab;
			ab = new Sbi();
			System.out.println("RateofInterest is =" + ab.RateOfInterest() + "%");
			
			ab= new Hdfc();
			System.out.println("RateofInterest is =" + ab.RateOfInterest() + "%");


		}

	}

