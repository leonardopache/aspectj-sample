package com;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(" + name + ")");
		this.name = name;
	}

	public void goUpper() {
		System.out.println("goUpper()");
		setName(getName().toUpperCase());
	}
}
