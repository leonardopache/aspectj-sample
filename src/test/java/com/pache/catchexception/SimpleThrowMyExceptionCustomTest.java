package com.pache.catchexception;

import org.junit.Test;

import com.pache.catchexception.exceptions.CustomException;

public class SimpleThrowMyExceptionCustomTest {

	@Test(expected = CustomException.class)
	public void testMyClazzWithException() throws CustomException {
		MyCommonClazz myClazz = new MyCommonClazz();
		myClazz.callWithException();
	}

}
