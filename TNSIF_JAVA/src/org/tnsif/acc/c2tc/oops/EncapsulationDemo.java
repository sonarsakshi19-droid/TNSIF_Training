package org.tnsif.acc.c2tc.oops;

class Human {
	private String name; // values has not assigned
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}

public class EncapsulationDemo { // controlled access no need to create multiple objects here

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setName("Sakshi");
		System.out.println(obj.getName());
		obj.setAge(21);
		System.out.println(obj.getAge());

		obj.setName("Sneha");
		System.out.println(obj.getName());
		obj.setAge(25);
		System.out.println(obj.getAge());



	}

}
