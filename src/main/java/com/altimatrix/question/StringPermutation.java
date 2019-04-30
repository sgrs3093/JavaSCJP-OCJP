package com.altimatrix.question;

public class StringPermutation {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length = a.length;
		System.out.println(length);

		// b= [9,8,7,6,5,4,3,2,1]
		int b[] = new int[length];
		for (int i = 0; i < length; i++) {

			b[length-1] = a[i];//1 b[8]=1, 2 b[]

			length--;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
