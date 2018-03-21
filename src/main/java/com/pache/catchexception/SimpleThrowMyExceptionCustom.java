/**
 * 
 */
package com.pache.catchexception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pache.catchexception.exceptions.CustomException;

/**
 * @author lpache
 */
public final class SimpleThrowMyExceptionCustom {
	
	private static Logger logger = LoggerFactory.getLogger(SimpleThrowMyExceptionCustom.class);
	
	private SimpleThrowMyExceptionCustom() {}

	public static final void throwCustomException() throws CustomException {
		logger.info("Throw exception!!");
		throw new CustomException("BooM!! My checked exception");
	}
}
