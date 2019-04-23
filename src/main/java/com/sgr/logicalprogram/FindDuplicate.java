package com.sgr.logicalprogram;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
	public static int repeatedNumber(final List<Integer> a) {
		System.out.println(a.size());
		int[] count = new int[a.size()];
		for (int i = 0; i <= a.size() - 1; i++) {
			count[a.get(i)]++;
			if (count[a.get(i)] > 1)
				return a.get(i);
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(8);
		al.add(1);

		repeatedNumber(al);
	}
}
