package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RNewController {
	@GetMapping("/read")
	public String readContent() {
		return "Read content";
	}

}
