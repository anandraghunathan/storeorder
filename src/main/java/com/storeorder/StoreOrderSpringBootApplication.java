package com.storeorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreOrderSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				new Object[] { StoreOrderSpringBootApplication.class }, args);
	}
}