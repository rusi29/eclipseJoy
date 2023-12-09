package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/getDemo")
	public String getDemo() {
		return "hello demo world";
	}
	
	@PostMapping("/postDemo")
	public String postDemo() {
		return "hello post world";
	}
}