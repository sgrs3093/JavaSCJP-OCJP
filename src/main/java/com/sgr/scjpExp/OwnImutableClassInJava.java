package com.sgr.scjpExp;

import java.util.Date;

/*
 * An immutable class is one whose state can not be changed once created.
 * 
 *  There are certain guidelines to create a class immutable in Java
 *  
 *  For making our own immutable java class object we need to follow some guidelines 
 *  
 *  1) Dont provide setter methods - method that modify fields or objects refereed by fields (setter methods meant to change the state of an object 
 *  
 *  2) Make all the fields final(cant change them ) and private(will not access from outside) that will ensure that we cant chage and it will not be access from outside the class
 *  
 *  3) Dont allow subclass to override the methods 
 *  	-> so make class as final , Final class in java can not be overridden 
 *  
 *  4)Special attention when having mutable instance variables 
 *  	- Always remember that your instance variable either mutable or immutable.Identify them and return new objects with copied content for 
 *  	all mutable objects .Immutable variables can be returned safely without extra efforts 
 *    
 */
/**
 * @author sshukl11
 *
 */
public final class OwnImutableClassInJava {

	public Date getDate() {
		return date;
	}

	private final int immutableField1;
	private final String immutableField2;
	private final Date date;

	// Default private constructor will ensure that no unplanned construction of
	// class
	private OwnImutableClassInJava(int immutableField1, String f2, Date date) {
		this.immutableField1 = immutableField1;
		this.immutableField2 = f2;
		this.date = date;
	}

	// Factory method to store object creation logic
	public static OwnImutableClassInJava creatInstance(int f1, String f2, Date d1) {
		return new OwnImutableClassInJava(f1, f2, d1);
	}

	public int getImmutableField1() {
		return immutableField1;
	}

	@Override
	public String toString() {
		return "OwnImutableClassInJava [immutableField1=" + immutableField1 + ", immutableField2=" + immutableField2
				+ ", date=" + date + "]";
	}

	public String getImmutableField2() {
		return immutableField2;
	}

}
