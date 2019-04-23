package com.sgr.logicalprogram;

/*
 * Reverse the String word by word 
 * input : I love India
 * output: India love I
 */
public class ReverseStringWordByWord {

	public static void main(String[] args) {
		String input = "I love India";
		reverseWord(input);
		reverseString();
	}

	static void reverseWord(String input) {
		// System.out.println(input);

		int length = input.length();
		// System.out.println(length);
		String ans = "";
		for (int i = length - 1; i >= 0; i--) {

			ans += input.charAt(i);

		}
		System.out.println(ans);
		System.out.println(ans.substring(0, ans.length()));

		String temp = "";
		for (int j = 0; j < ans.length(); j++) {
			if (ans.contains(" ")) {
				break;
			}

		}

	}

	/*
	 * this method to meant for reversing the string word by word Exp :
	 */
	static public void reverseString() {

		String givenStr = "hi welcome to UHG ";
		String s[] = givenStr.split(" ");
		String ans = "";

		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Reverse String ");
		System.out.println(ans.substring(0, ans.length() - 1));

	}

}
