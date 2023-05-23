package com.salesianostriana.dam.ProyectoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	/*@GetMapping("/me")
	public String me() {

		Usuario u = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		System.out.println(u.toString());

		return "perfil";
	}

	@GetMapping("/me2")
	public String me2(@AuthenticationPrincipal Usuario u) {

		System.out.println(u.toString());

		return "perfil";
	}*/


}
