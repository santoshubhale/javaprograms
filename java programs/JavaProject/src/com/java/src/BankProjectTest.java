package com.java.src;

public class BankProjectTest {
	
		public static void main(String[] args) {
			BankProject b = new BankProject();
			b.insert(76769, "santosh", 1000);
			b.display();
			b.balance();
			b.deposite(1000);
			b.balance();
			b.withdraw(500);
			b.balance();

		}
	}


