package com.gestao.reservas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/listarReservas").setViewName("reservas");
		registry.addViewController("/").setViewName("reservas");
		registry.addViewController("/listarReservas").setViewName("reservas");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/accessDenied").setViewName("accessDenied");
		registry.addRedirectViewController("/login?error", "login");
	}
}
