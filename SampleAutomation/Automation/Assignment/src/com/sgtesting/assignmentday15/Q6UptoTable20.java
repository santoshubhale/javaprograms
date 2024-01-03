package com.sgtesting.assignmentday15;

class TalbeDemo {
	void table(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + "=" + a * i);
		}
	}

	void AnotherTable() {
		for (int num = 1; num <= 20; num++) {
			System.out.println(num + " is Table");
			int x = 1;
			for (int i = 1; i <= 10; i++) {

				System.out.println(num + "*" + i + "=" + num * i);
			}
		}
	}
}

public class Q6UptoTable20 {

	public static void main(String[] args) {
		TalbeDemo td = new TalbeDemo();
		td.table(1);
		td.table(2);
		td.table(3);
		td.table(4);
		td.table(5);
		td.table(6);
		td.table(7);
		td.table(8);
		td.table(9);
		td.table(10);
		td.table(11);
		td.table(12);
		td.table(13);
		td.table(14);
		td.table(15);
		td.table(16);
		td.table(17);
		td.table(18);
		td.table(19);
		td.table(20);
		td.AnotherTable();

	}

}
