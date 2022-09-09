package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
public class AdminServiceApplication {

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

}
