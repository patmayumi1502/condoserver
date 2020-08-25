package com.condoserver.moradorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
=======
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
>>>>>>> d1401c1520869f96233d8378cd822096378ef11c

public class MoradorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoradorServiceApplication.class, args);
	}

}
