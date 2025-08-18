package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.spring.entity.Recharge;

@Aspect
@Component
public class MessageAspects {
    @Before("execution(* com.spring.entity.Recharge.myRecharge(..))")
	public void before() {
		System.out.println("Your Recharge is expiring soon");
		System.out.println("please Recharge immediately..");
	}
    
    @After("execution(* com.spring.entity.Recharge.myRecharge(..))")
    public void after() {
    	System.out.println("Recharge successfully");
    	System.out.println("Enjoy your datapack..");
    }
}
