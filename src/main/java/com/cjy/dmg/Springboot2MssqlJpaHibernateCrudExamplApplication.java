package com.cjy.dmg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springboot2MssqlJpaHibernateCrudExamplApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2MssqlJpaHibernateCrudExamplApplication.class, args);
	}

}

@RestController
class HelloController{
	
	@GetMapping("/")
	String hello() {
		return "Hello World";
	}
}
