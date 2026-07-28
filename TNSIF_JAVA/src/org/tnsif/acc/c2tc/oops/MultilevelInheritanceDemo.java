package org.tnsif.acc.c2tc.oops;

class Device {
	void deviseType() {
		System.out.println("I am an electronic device");
	}
}

class Phone extends Device {
	void brand() {
		System.out.println("brand:Samsung");
	}

}

class SmartPhone extends Phone {
	void features() {
		System.out.println("Features:Touchscreen,camera,Internet");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.deviseType();
		sp.features();
		sp.brand();
		// TODO Auto-generated method stub

	}

}
