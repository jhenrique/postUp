package com.pensamentos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.pensamentos.entity" })
@EnableJpaRepositories(basePackages = { "com.pensamentos.repository" })
@ComponentScan(basePackages = {"com.pensamentos.controller"})
public class PensamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensamentosApplication.class, args);
	}

}
