package com.pache.catchexception;

import com.pache.catchexception.exceptions.CustomException;

public class MyCommonClazz {

	public void callWithException() throws CustomException {
		try {
			SimpleThrowMyExceptionCustom.throwCustomException();
		} catch (CustomException e) {
			throw(e);
		}
	}
}
