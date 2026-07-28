package org.tnsif.acc.c2tc.oops;

class Employee {
	void company() {
		System.out.println("Comapany:TNSIF");
	}
}

class Developer extends Employee {
	void role() {
		System.out.println("Role:Software Developer");
	}
}

class Tester extends Employee {
	void role() {
		System.out.println("Role:QA Tester");
	}
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.company();
		dev.role();
		Tester tes = new Tester();
		tes.company();
		tes.role();
		// TODO Auto-generated method stub

	}

}
