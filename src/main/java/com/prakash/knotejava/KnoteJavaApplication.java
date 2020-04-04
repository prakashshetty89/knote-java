package com.prakash.knotejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prakash"})
public class KnoteJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnoteJavaApplication.class, args);
	}

}
