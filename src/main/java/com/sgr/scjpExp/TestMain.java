package com.sgr.scjpExp;

import java.util.Date;

class TestMain {
	public static void main(String[] args) {
		OwnImutableClassInJava i = OwnImutableClassInJava.creatInstance(100, "test", new Date());
		System.out.println(i);
		tryModification(i.getImmutableField1(), i.getImmutableField2(), i.getDate());
		System.out.println(i);

	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}
