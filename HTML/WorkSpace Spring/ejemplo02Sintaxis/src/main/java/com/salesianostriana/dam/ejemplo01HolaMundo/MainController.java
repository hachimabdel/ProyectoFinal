package com.salesianostriana.dam.ejemplo01HolaMundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	
	@Autowired
	private DummyService service;
	
	@GetMapping({"/", "welcome"})

}
