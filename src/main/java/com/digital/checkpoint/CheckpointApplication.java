package com.digital.checkpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EntityScan(basePackages = "com.digital.checkpoint.model")
public class CheckpointApplication {
	public static void main(String[] args) {
		SpringApplication.run(CheckpointApplication.class, args);
	}
}
