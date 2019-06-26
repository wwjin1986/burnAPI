package com.weiweijin.burn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMvcCOnfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/")
			.allowedOrigins("*")
			.allowedMethods("POST","GET","DELETE","PUT","HEADERS")
			.allowedHeaders("*");
		}
}
