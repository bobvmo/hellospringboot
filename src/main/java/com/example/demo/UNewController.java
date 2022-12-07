package com.example.demo;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.NewDTO;

@RestController
public class UNewController {
	@PutMapping("/update")
	public NewDTO updateContent(@RequestBody NewDTO model) {
		model.setTitle("update title "+model.getTitle());
		model.setContent("update"+model.getContent());
		return model;
	}
}
