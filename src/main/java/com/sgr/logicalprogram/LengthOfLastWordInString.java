package com.sgr.logicalprogram;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		String s="Welcome to ADP";
		System.out.println("Length is : " + findingLastStringWordLength("Wlcom to UHG"));
	}

	static int findingLastStringWordLength(final String word) {
		System.out.println("Given word is : " + word);
		// taking temp string as given string is in final
		String temp = word.trim();
		int length = 0;

		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ') {
				length = 0;
			} else {
				length++;
			}
		}
		return length;
	}
}
