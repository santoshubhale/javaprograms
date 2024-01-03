package com.sgtesting.assignmentday26;

abstract class Govt {
	abstract void govtFund();
}

class CentralGovt extends Govt {

	void govtFund() {
		long fund = 100000000;
		System.out.println("Central govt fund :-" + fund);

	}

}

class StateGovt extends Govt {

	void govtFund() {
		long fund = 999999999;
		System.out.println("State govt fund :- " + fund);

	}

}

class DivisionGovt extends Govt {

	void govtFund() {
		long fund = 888888888;
		System.out.println("Division govt fund :- " + fund);

	}

}

class DistrictGovt extends Govt {

	void govtFund() {
		long fund = 7777777;
		System.out.println("District govt fund :- " + fund);

	}

}

class TalukGovt extends Govt {

	void govtFund() {
		long fund = 666666;
		System.out.println("Taluk govt fund :- " + fund);

	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Govt g = null;
		CentralGovt centralgovt = new CentralGovt();
		StateGovt stategovt = new StateGovt();
		DivisionGovt divisiongovt = new DivisionGovt();
		DistrictGovt distictgovt = new DistrictGovt();
		TalukGovt talukgovt = new TalukGovt();
		g = centralgovt;
		g.govtFund();
		g = stategovt;
		g.govtFund();
		g = divisiongovt;
		g.govtFund();
		g = distictgovt;
		g.govtFund();
		g = talukgovt;
		g.govtFund();
	}

}
