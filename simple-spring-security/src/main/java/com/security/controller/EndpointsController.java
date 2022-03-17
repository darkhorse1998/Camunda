package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {
	
	@GetMapping(path = "/accessible")
	public String accessibleByAll() {
		return "This endpoint is acessible by all. No auth required.";
	}
	
	@GetMapping(path = "/auth")
	public String accessibleByAuth() {
		return "This endpoint is acessible only with proper auth.";
	}
	
	@GetMapping(path = "/forbidden")
	public String contact() {
		return "This endpoint is forbidden. Not accessible by anyone irrespective of auth.";
	}
}
