package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Country;

@Configuration
public class ConfigureClass {
@Bean("con")
public Country c_object() {
	return new Country();
	
	
}
}
