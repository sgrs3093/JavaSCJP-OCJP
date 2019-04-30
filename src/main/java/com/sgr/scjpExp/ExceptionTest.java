package com.sgr.scjpExp;

import java.io.IOException;

public class ExceptionTest {

	static int m1() throws ArithmeticException {
		try {
			int i = 10 / 0;
			System.out.println(10 / 2);

		} catch (Exception e) {
			System.out.println("hi");
			return 1;
		}
		return 2;

	}

	public static void main(String[] args) {
		m1();
	}
}
