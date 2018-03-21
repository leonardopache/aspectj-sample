package com;

public class Main {
	void execute() {
		Person p = new Person("sample");
		p.setName("calling setter");
		p.goUpper();
	}

	public static void main(String[] args) {
		new Main().execute();
	}
}