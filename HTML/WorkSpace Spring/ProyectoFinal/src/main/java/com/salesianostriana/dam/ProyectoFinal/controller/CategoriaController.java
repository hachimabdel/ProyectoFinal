package com.salesianostriana.dam.ProyectoFinal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.ProyectoFinal.model.Categoria;
import com.salesianostriana.dam.ProyectoFinal.service.CategoriaService;
import com.salesianostriana.dam.ProyectoFinal.service.ProductoService;


@Controller
@RequestMapping("/admin/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("categorias", categoriaService.findAll());
		return "admin/listado-categoria";
	}
	
	@GetMapping("/nueva")
	public String nuevaCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "admin/formulario-categoria";
	}

}
