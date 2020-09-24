package com.teste.spring.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.spring.to.CarroTO;

@RestController
@RequestMapping("/carros")
public class CarroController {
	private Logger LOGGER = LogManager.getLogger(CarroController.class);

	@GetMapping(consumes =MediaType.APPLICATION_JSON_VALUE , path = "/salvar")
	public String salvar(@RequestBody CarroTO to) {
		LOGGER.info(to.toString());
		return "ok";
		
	}
}
