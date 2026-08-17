package org.tnsif.acc.c2tc.JavaInterviewBasics;

import java.util.Scanner;
public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 3, 2, 4, 1};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}


