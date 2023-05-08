package com.salesianostriana.dam.ejemplo01HolaMundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//Dentro de @Controller tenemos los metodos que responden a peticiones 
public class ControladorSaludo {

	// Con el GetMapping quiere decir que atiende a la peticion welcome
	// Se le estan pasando dos atributos String y Model
	@GetMapping({ "/", "welcome" })
	public String welcome(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre,
			Model model) {
		model.addAttribute("nombre", nombre);// se le pasa

		return "index";

	}

	// Dps del @GetMapping en los parentesis si va mas de una palabra se le pone los
	// corchetes como en el primer @GetMapping
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Ángel", "Naranjo González"));

		return "SaludoPersonalizado";

	}

	@GetMapping("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "¡Se me está haciendo largo el proyecto final!");
		model.addAttribute("url", "https://triana.salesianos.edu");

		return "SaludoYEnlace";

	}

}
