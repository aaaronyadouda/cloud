package com.ijilad.spring_cloud.departement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DepartementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartementApplication.class, args);
	}

}
