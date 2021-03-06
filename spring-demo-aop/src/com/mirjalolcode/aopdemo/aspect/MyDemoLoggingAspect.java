package com.mirjalolcode.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of related advice for logging
	//@Before("execution(public void addAccount())")
	@Before("execution(* spring.mirjalolcode.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("/n=====>> Executing @Before advice on addAccount()");
	}
}
