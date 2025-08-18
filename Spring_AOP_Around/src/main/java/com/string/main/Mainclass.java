package com.string.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.string.config.Config;
import com.string.entity.Recharge;

public class Mainclass {
public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
	Recharge r= context.getBean(Recharge.class);
	r.rechargeLogic();
}
}
