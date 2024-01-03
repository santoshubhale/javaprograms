package com.java.src;

public class ObjAndCls {
	int id;
	String name;
	int mobileno;

	 void person(int id, String n, int m) {
		this.id = id;
		name = n;
		mobileno = m;

	}
	void disply() {
		System.out.println(id+" "+name+" "+mobileno);
	}

	public static void main(String[] args) {
		ObjAndCls oc = new ObjAndCls();
		ObjAndCls oc1 = new ObjAndCls();
		ObjAndCls oc2 = new ObjAndCls();

		oc.person(10, "santosh", 92345670);
		oc1.person(12, "suhas", 8979800);
		oc2.person(23, "darshan", 786373670);
		oc.disply();
		oc1.disply();
		oc2.disply();
	}

}
