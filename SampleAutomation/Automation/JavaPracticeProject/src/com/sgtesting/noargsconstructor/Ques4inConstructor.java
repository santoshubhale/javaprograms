package com.sgtesting.noargsconstructor;

class Country {
	String countryname;
	int countrysqkm;
	String countryPmname;
	int totalstateincountry;

	Country() {
		countryname = "India";
		countrysqkm = 3200000;
		countryPmname = "Narendra Modi";
		totalstateincountry = 28;
		System.out.println("countryname:-" + countryname);
		System.out.println("countrysqkm:-" + countrysqkm);
		System.out.println("countryPmname:-" + countryPmname);
		System.out.println("totalstateincountry:-" + totalstateincountry);
		System.out.println("--------------------------");
	}
}

class State {
	String statename;
	int statesqkm;
	String statecmname;
	int totaldistrictinstate;

	State() {
		statename = "Karnataka";
		statesqkm = 191791;
		statecmname = "YogiAdithya";
		totaldistrictinstate = 31;
		System.out.println("statename:-" + statename);
		System.out.println("statesqkm:-" + statesqkm);
		System.out.println("Statecmname:-" + statecmname);
		System.out.println("totaldistrictinstate:-" + totaldistrictinstate);
		System.out.println("--------------------------");
	}

}

class District {
	String districtname;
	int districtaqkm;
	String districtmpname;
	int totaltalukindist;

	District() {
		districtname = "Gulbarga";
		districtaqkm = 13000;
		districtmpname = "ishwar";
		totaltalukindist = 30;
		System.out.println("districtname:-" + districtname);
		System.out.println("districtaqkm:-" + districtaqkm);
		System.out.println("districtmpname:-" + districtmpname);
		System.out.println("totaltalukindist:-" + totaltalukindist);
		System.out.println("--------------------------");

	}

}

class Taluk {
	String talukname;
	int taluksqkm;
	String taluktpname;
	int totalhoblisintaluk;

	Taluk() {
		talukname = "sindhnoor";
		taluksqkm = 1000;
		taluktpname = "siddu";
		totalhoblisintaluk = 10;
		System.out.println("talukname:-" + talukname);
		System.out.println("taluksqkm:-" + taluksqkm);
		System.out.println("taluktpname:-" + taluktpname);
		System.out.println("totalhoblisintaluk:-" + totalhoblisintaluk);

	}

}

public class Ques4inConstructor {

	public static void main(String[] args) {

		Country c = new Country();

		State s = new State();

		District d = new District();

		Taluk t = new Taluk();
	}

}
