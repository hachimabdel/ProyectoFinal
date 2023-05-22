package com.salesianostriana.dam.ProyectoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/e")
	public String index() {
		return "admin";
	}
	@GetMapping("/")
	public String portada() {
		return "index";
	}

}
