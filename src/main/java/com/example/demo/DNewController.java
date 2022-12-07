package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.NewDTO;

@RestController
public class DNewController {
	@DeleteMapping("/delete")
	public NewDTO deleteContent(@RequestBody NewDTO model) {
		return model;
	}
}
