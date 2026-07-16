package org.tnsif.acc.c2tc.javabasics;

public class VariableDemo {
	int price = 10;// instance

	void print() {
		String msg = "hello";// local var
		System.out.println(msg);
	}

	static String message = "Hello World";// static need not call with obj name

	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);

		// TODO Auto-generated method stub

	}

}
