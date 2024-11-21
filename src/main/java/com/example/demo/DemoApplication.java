package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
	// Bug - 130
	int i=10;
        SpringApplication.run(DemoApplication.class, args);
    }

}
