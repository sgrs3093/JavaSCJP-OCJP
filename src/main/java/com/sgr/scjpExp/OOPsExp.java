package com.sgr.scjpExp;

class A {
	int a=10;
	void m1() {
		System.out.println("from A");
	}
}

public class OOPsExp extends A {
	int a=20;
	void m1() {
		System.out.println("from B");
	}

	public static void main(String[] args) {
		
		A b = new A();
		A a = new OOPsExp();
		
		b.m1();
		a.m1();
		System.out.println(a.a);
	}
}
