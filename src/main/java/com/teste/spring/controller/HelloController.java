package com.teste.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testespring")
public class HelloController {

	
	@GetMapping
	public String index() {
		return "teste";
	}
	
}
