package com.sgtesting.assinmentday25;

interface Country {
	abstract void displayCountryPopulation(long countrypopulation);
}

interface State {
	void displayStatePopulation(int statepopulation);
}

interface District {
	void displayDistrictPopulation(int districtpopulation);
}

class PopulationDemo123 implements Country, State, District {

	public void displayCountryPopulation(long countrypopulation) {
		System.out.println("Country Population =" + countrypopulation);
	}

	public void displayStatePopulation(int statepopulation) {
		System.out.println("State Population =" + statepopulation);
	}

	public void displayDistrictPopulation(int districtpopulation) {
		System.out.println("District Population =" + districtpopulation);
	}
}

public class Q1SubClassmoreThenThreeInterface {

	public static void main(String[] args) {
		PopulationDemo123 p = new PopulationDemo123();
		p.displayCountryPopulation(1000000000);
		p.displayStatePopulation(10000000);
		p.displayDistrictPopulation(10000);

	}

}
