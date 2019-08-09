package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;

@SpringBootApplication
public class MvcWithBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcWithBootApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp);
		ctx.close();
	}

}
