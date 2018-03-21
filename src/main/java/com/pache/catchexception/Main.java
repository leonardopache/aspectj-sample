package com.pache.catchexception;

import com.pache.catchexception.exceptions.CustomException;

public class Main {

	public static void main(String[] args) {
		MyCommonClazz m = new MyCommonClazz();
		try {
			m.callWithException();
		} catch (CustomException e) {

		}
	}

}
