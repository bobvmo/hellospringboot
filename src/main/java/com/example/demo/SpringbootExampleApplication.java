package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@SpringBootApplication
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleApplication.class, args);
	}

	@RestController
	class HelloWorldController {
		@GetMapping("/")
		public String hello( @RequestHeader MultiValueMap<String, String> headers) {
			headers.forEach((key, value) -> {
				System.out.println(String.format(
						"Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
			});

			return "helloworld";
		}
	}
}
