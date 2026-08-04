package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Name of the user:" + name);
		System.out.println("Age of the user:" + age);
		sc.close();// TODO Auto-generated method stub

	}

}
