package org.tnsif.acc.c2tc.oops;

class Course {
	String courseName = "Java Programming"; // instance var

	void showCourse() {
		System.out.println("Course:" + courseName);// parent class
	}
}

class Student extends Course {
	String name = "Ali";

	void showStudent() {
		System.out.println("student:" + name);
	}
}

public class SingleLevelInheritenceDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.showCourse();
		student.showStudent();
		// TODO Auto-generated method stub

	}

}
