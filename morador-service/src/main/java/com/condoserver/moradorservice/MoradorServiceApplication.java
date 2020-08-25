package com.condoserver.moradorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class MoradorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoradorServiceApplication.class, args);
	}

}
