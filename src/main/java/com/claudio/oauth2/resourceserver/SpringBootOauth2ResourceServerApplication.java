package com.claudio.oauth2.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootOauth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauth2ResourceServerApplication.class, args);
	}

}
