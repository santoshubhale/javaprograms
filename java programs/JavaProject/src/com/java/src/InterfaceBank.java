package com.java.src;

public interface InterfaceBank {
	float rateofinterset();

}
class Sbi1 implements InterfaceBank{
	public float rateofinterset() {
		return 9.5f;
	}
	class Hdfc implements InterfaceBank{
		public float rateofinterset() {
			return 8.75f;
		}
	}
	
	 class InterfaceBankTest{
		public static void main(String[] args) {
			InterfaceBank b = new Sbi1();
			System.out.println("ROI"+b.rateofinterset());
		}
	}
	
}
