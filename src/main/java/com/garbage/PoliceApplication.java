package com.garbage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.garbage.service")
@ComponentScan(basePackages = "com.garbage.repository")
@ComponentScan(basePackages = "com.garbage.model")
@SpringBootApplication
@ComponentScan(basePackages = { "com.garbage.controller" })
public class PoliceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliceApplication.class, args);
		System.out.println("my application .... ");
	}

}
