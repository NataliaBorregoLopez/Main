package com.ejemplos.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ejemplos.spring.controller.RequestProcessingTimeInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	RequestProcessingTimeInterceptor rqTimeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(rqTimeInterceptor).addPathPatterns("/home");
	}
	
}
