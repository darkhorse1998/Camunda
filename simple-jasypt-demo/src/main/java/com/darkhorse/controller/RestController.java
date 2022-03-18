package com.darkhorse.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/")
	public String getAdvice() {
		return "Time in the market is more important than timing the market.";
	}
}