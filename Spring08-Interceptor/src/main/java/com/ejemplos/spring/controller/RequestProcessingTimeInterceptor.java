package com.ejemplos.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RequestProcessingTimeInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(RequestProcessingTimeInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		logger.info(
				"--[Interceptor > preHandle]: Arrancando " + request.getRequestURL().toString() + " y cronometro--");
		request.setAttribute("startTime", startTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("--[Interceptor > postHandle]: Desplegando " + request.getRequestURL().toString() + " --");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
		logger.info("--[Interceptor > afterCompletion]--");
		logger.info("-- Request URL::" + request.getRequestURL().toString() + "mostrada. Paro cronometro--");
		logger.info("-- Request URL::" + request.getRequestURL().toString() + " ha necesitado "
				+ (System.currentTimeMillis() - startTime) + " ms--");
	}
}
