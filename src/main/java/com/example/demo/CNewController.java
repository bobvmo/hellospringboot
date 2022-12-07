package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.NewDTO;

@RestController
public class CNewController {
	@PostMapping("/create")
	public NewDTO createContent(@RequestBody NewDTO model) {
		return model;
	}
}
