package com.teste.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testespring")
public class HelloController {

	private Logger LOGGER = LogManager.getLogger(HelloController.class);
	@GetMapping
	public String index() {
		LOGGER.info("chegou");
		return "teste";
	}
	
}
