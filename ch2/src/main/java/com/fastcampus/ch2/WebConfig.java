package com.fastcampus.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		// /register → registerForm.html or registerForm.jsp
		registry.addViewController("/register/add").setViewName("registerForm"); // GET 요청만 허용

	}
	
    @Bean
    public GlobalValidator globalValidator() {
        return new GlobalValidator();
    }

    @Override
    public Validator getValidator() {
        return globalValidator(); // ← annotation-driven에 넣는 효과
    }
}