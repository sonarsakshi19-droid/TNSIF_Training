package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("Enter your height");
		float height = sc.nextFloat();

		System.out.println("Are you a Student");
		boolean is_Student = sc.nextBoolean();

		System.out.println("Enter your Aadhar Number");
		long aadhar = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter your favorite Teacher Name");
		String teacher = sc.nextLine();

		System.out.println("Enter your hobby");
		String hobby = sc.nextLine();

		System.out.println("Enter your daily reading time in minutes");
		byte reading = sc.nextByte();

		System.out.println("Enter your CGPA");
		double cgpa = sc.nextDouble();

		System.out.println("Enter no of sibling");
		short noOfsib = sc.nextShort();

		System.out.println("Student Information:");
		System.out.println("Name" + name);
		System.out.println("Age" + age);
		System.out.println("Height" + height);
		System.out.println("IsStudent" + is_Student);
		System.out.println("aadharNumber" + aadhar);
		System.out.println("Teacher" + teacher);
		System.out.println("Hobbies" + hobby);
		System.out.println("Reading" + reading);
		System.out.println("CGPA" + cgpa);
		System.out.println("Siblings" + noOfsib);

	}

}
