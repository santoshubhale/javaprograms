package com.sgtesting.parametrizedconstructor;

class Country {
	String countryname;
	int countrysqkm;
	String countryPmname;
	int totalstateincountry;

	Country(String Countryname,int Countrysqkm,String CountryPmname,int Totalstateincountry) {
		countryname = Countryname;
		countrysqkm = Countrysqkm;
		countryPmname = CountryPmname;
		totalstateincountry = Totalstateincountry;
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

	State(String Statename,int Statesqkm,String Statecmname,int Totaldistrictinstate) {
		statename = Statename;
		statesqkm = Statesqkm;
		statecmname = Statecmname;
		totaldistrictinstate = Totaldistrictinstate;
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

	District(String Districtname,int Districtaqkm,String Districtmpname,int Totaltalukindist) {
		districtname =Districtname;
		districtaqkm = Districtaqkm;
		districtmpname = Districtmpname;
		totaltalukindist = Totaltalukindist;
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

	Taluk(String Talukname,int Taluksqkm,String Taluktpname,int Totalhoblisintaluk) {
		talukname = Talukname;
		taluksqkm = Taluksqkm;
		taluktpname = Taluktpname;
		totalhoblisintaluk = Totalhoblisintaluk;
		System.out.println("talukname:-" + talukname);
		System.out.println("taluksqkm:-" + taluksqkm);
		System.out.println("taluktpname:-" + taluktpname);
		System.out.println("totalhoblisintaluk:-" + totalhoblisintaluk);

	}

}

public class Ques4inParametrizedConstructor {

	public static void main(String[] args) {
		Country c = new Country("India",3200000,"Narendra Modi",28);

		State s = new State("Karnataka",191791,"YogiAdithya",31);

		District d = new District("Gulbarga",13000,"ishwar",30);

		Taluk t = new Taluk("sindhnoor",1000,"siddu",10);

	}

}
