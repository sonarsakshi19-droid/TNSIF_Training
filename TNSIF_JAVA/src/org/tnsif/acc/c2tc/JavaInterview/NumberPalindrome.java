package org.tnsif.acc.c2tc.JavaInterview;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num = 124;
		int originalNum = num;
		int rem;
		int reverseNum = 0;
		while (num != 0) {
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num = num / 10;
		}
		if (originalNum == reverseNum) {
			System.out.println("Number is palindrome");
		} else {

			System.out.println("Number is not palindrome");
		}



	}

}
