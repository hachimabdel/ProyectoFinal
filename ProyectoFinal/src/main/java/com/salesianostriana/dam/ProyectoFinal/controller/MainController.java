package com.salesianostriana.dam.ProyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.ProyectoFinal.model.Producto;
import com.salesianostriana.dam.ProyectoFinal.service.CategoriaService;
import com.salesianostriana.dam.ProyectoFinal.service.ProductoService;

@Controller
public class MainController {
	private static final int NUM_PRODUCTOS_ALEATORIOS = 8;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public String index(@RequestParam(name="idCategoria", required=false) Long idCategoria, Model model) {		
		
		//Agregamos lista con todas las categorías al modelo
		model.addAttribute("categorias", categoriaService.findAll());
		
		List<Producto> productos;
		
		/*Si la categoría no es nula, obtenemos 8 productos aleatoriamente, 
		 * si es nula obtenemos todos los de 
		 * la categoría con ese id, el llamado idcategoria*/
		if (idCategoria == null) {
			productos = productoService.obtenerProductosAleatorios(NUM_PRODUCTOS_ALEATORIOS);
		} else {			
			productos = productoService.findAllByCategoria(idCategoria);
		}
		
		model.addAttribute("productos", productos);
		
		return "index";
	}
	
	@GetMapping("/product/{id}")
	public String showDetails(@PathVariable("id") Long id, Model model) {
		
		//Buscamos el producto por id
		Producto p = productoService.findById(id);
		//Si el producto no es null (si existe el producto buscado) se añade al modelo y mostramos la página del detalle detail.html
		//Si no existe, volvemos a la página index que vuelve a realizar todo lo que hace el método index
		if (p != null) {
			model.addAttribute("producto", p);
			return "detail";
		}
		
		return "redirect:/";
		
	}

}
