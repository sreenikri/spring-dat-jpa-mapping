package com.edu.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.edu.jpa.*")
//@EnableSwagger2
public class SpringDatJpaMappingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDatJpaMappingApplication.class, args);
	}

}
