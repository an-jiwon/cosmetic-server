package com.cosmetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.cosmetic"})
public class CosmeticApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmeticApplication.class, args);
	}
}
