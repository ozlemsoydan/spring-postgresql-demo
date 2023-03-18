package com.example.springpostgresqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringPostgresqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgresqlDemoApplication.class, args);
	}

}
