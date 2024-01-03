package com.sgtesting.assignmentday11;

class Country {
	String countryname;
	int countrysqkm;
	String countryPmname;
	int totalstateincountry;
}

class State {
	String statename;
	int statesqkm;
	String statecmname;
	int totaldistrictinstate;

}

class District {
	String districtname;
	int districtaqkm;
	String districtmpname;
	int totaltalukindist;

}

class Taluk {
	String talukname;
	int taluksqkm;
	String taluktpname;
	int totalhoblisintaluk;

}

public class Ques4 {

	public static void main(String[] args) {

		Country c = new Country();
		c.countryname = "India";
		c.countrysqkm = 3200000;
		c.countryPmname = "Narendra Modi";
		c.totalstateincountry = 28;
		System.out.println("countryname:-" + c.countryname);
		System.out.println("countrysqkm:-" + c.countrysqkm);
		System.out.println("countryPmname:-" + c.countryPmname);
		System.out.println("totalstateincountry:-" + c.totalstateincountry);
		System.out.println("--------------------------");
		State s = new State();
		s.statename = "Karnataka";
		s.statesqkm = 191791;
		s.statecmname = "YogiAdithya";
		s.totaldistrictinstate = 31;
		System.out.println("statename:-" + s.statename);
		System.out.println("statesqkm:-" + s.statesqkm);
		System.out.println("Statecmname:-" + s.statecmname);
		System.out.println("totaldistrictinstate:-" + s.totaldistrictinstate);
		System.out.println("--------------------------");
		District d = new District();
		d.districtname="Gulbarga";
		d.districtaqkm=13000;
		d.districtmpname="ishwar";
		d.totaltalukindist=30;
		System.out.println("districtname:-" + d.districtname);
		System.out.println("districtaqkm:-" + d.districtaqkm);
		System.out.println("districtmpname:-" + d.districtmpname);
		System.out.println("totaltalukindist:-" + d.totaltalukindist);
		System.out.println("--------------------------");
		Taluk t = new Taluk();
		t.talukname="sindhnoor";
		t.taluksqkm=1000;
		t.taluktpname="siddu";
		t.totalhoblisintaluk=10;
		System.out.println("talukname:-" + t.talukname);
		System.out.println("taluksqkm:-" + t.taluksqkm);
		System.out.println("taluktpname:-" + t.taluktpname);
		System.out.println("totalhoblisintaluk:-" + t.totalhoblisintaluk);
	

	}

}
