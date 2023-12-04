package com.venkatesh.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ByeController {
	
	@GetMapping("/bye")
	public String sayBye() {
		return "Bye Everyone!";
	}

}
