package org.tnsif.acc.c2tc.JavaInterview;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "saas";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("String is palindrome");

		} else {
			System.out.println("String is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
