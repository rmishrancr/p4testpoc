package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class DemotestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemotestApplication.class, args);
		//1111
		//2222
		//3333
	}

}
