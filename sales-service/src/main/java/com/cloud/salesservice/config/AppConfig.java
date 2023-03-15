package com.cloud.salesservice.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}
	
	@Bean
	public Mapper getMapper() {
		return new DozerBeanMapper();
	}

}
