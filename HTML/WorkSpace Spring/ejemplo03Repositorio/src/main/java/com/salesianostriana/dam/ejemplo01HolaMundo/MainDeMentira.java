
package com.salesianostriana.dam.ejemplo01HolaMundo;

import org.springframework.beans.factory.annotation.Autowired;

public class MainDeMentira {
	
	@Autowired
	private TaskRepositorio taskRepositorio;
	
	@PostConstruct
	
	public void ejecutar () {
		
		Task t1 = Task.builder()
				.title("Comprar")
				.done(false)
				.limitDate(null);
	}
	
	

}
