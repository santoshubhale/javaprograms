package com.java.src;

public class MultiLevelInhertitancePrgm {
	void bike() {
		System.out.println("Bike is Running...");
	}
}

class MultiLevelInhertitancePrgm2 extends MultiLevelInhertitancePrgm {
	void car() {
		System.out.println("car is Running....");
	}

}

class MultiLevelInhertitancePrgm3 extends MultiLevelInhertitancePrgm2 {
	void aeroplane() {
		System.out.println("AeroPlane is Running...");
	}

}
class TestMI{

	public static void main(String[] args) {
		MultiLevelInhertitancePrgm3 mlip = new MultiLevelInhertitancePrgm3();
		mlip.bike();
		mlip.car();
		mlip.aeroplane();
		

	}

}
