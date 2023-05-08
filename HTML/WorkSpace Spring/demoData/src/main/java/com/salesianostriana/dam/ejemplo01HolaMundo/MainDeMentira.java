package com.salesianostriana.dam.ejemplo01HolaMundo;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class MainDeMentira {

	@Autowired
	private AlumnoRepositorio alumnoRepositorio;
	
	@PostConstruct
	public void ejecutar () {
		Alumno a1 = Alumno.builder()
				//.id(1L)
				.nombre("Pepe")
				.apellidos("Perez Perez")
				.email("pepe.perex@triana.salesianos.edu")
				.fechaNacimiento(LocalDate.of(1999, 12, 31))
				.build();
		alumnoRepositorio.save(a1);
		
		List <Alumno> result = alumnoRepositorio.findAll();
		
		result.forEach(System.out::println);
	}
}
