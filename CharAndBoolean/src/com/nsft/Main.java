package com.nsft;

public class Main {

    public static void main(String[] args) {

    	// width of 16 (2 bytes)
		char myChar = '\u00A9';

		System.out.println("Unicode output was: " + myChar);

		boolean myBoolean = false;
		boolean isMale = true;

		// Challenge

		// 1.
		// ®

		// 2.
		char registerUnicode = '\u00AE';

		// 3.
		System.out.println("The register unicode: " + registerUnicode);

    }
}
