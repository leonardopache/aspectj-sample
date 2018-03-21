package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Pointcut("execution(* set*(..)) && target(com.Person)")
	public void inPersonSetter() {
	}

	@Pointcut("execution(* go*(..)) && target(com.Person)")
	public void inPersonGo() {
	}

	@Around("inPersonSetter() || inPersonGo()")
	public Object performLogging(ProceedingJoinPoint jpj) throws Throwable {
		System.out.println("----- Before method call " + jpj.getSignature().toLongString() + " -------");
		return jpj.proceed();
	}
}