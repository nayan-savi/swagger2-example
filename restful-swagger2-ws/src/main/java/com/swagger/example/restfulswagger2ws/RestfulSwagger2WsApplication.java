package com.swagger.example.restfulswagger2ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class RestfulSwagger2WsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulSwagger2WsApplication.class, args);
	}

}
