package com.pache.catchexception;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AuditMyCustomException {

	private Logger logger = LoggerFactory.getLogger(AuditMyCustomException.class);

	// @AfterThrowing(pointcut = "execution(* MyCommonClazz.*(..))", throwing =
	// "error")
	// public void logMyCustomException(JoinPoint pjp, Throwable error) throws
	// Throwable {
	// logger.info("Throw exception en Aspect!!");
	// // log exception
	// throw error;
	// }
	//
	// @AfterThrowing(pointcut = "execution(**(..))", throwing = "error")
	// public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
	//
	// System.out.println("logAfterThrowing() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("Exception : " + error);
	// System.out.println("******");
	//
	// }

	@Pointcut("execution(* call*(..)) && target(com.pache.catchexception.MyCommonClazz)")
	private void callMethods() {
	}

	@Around("callMethods()")
	public void trace(ProceedingJoinPoint pjp) throws Throwable {

		logger.info("Throw exception en Aspect!!");

	}
}
