package com.string.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
	@Around("execution(* com.string.entity.Recharge.rechargeLogic(..))")
public void around(ProceedingJoinPoint p) {
	System.out.println("Your plan is going to expire..Please Recharge..");
	try {
		p.proceed();
	} catch (Throwable e) {
		e.printStackTrace();
	}
	System.out.println("Recharge successfull");
}
}
