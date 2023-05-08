package com.salesianostriana.dam.ejemplo05OneToMany;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.ejemplo05OneToMany.model.Alumno;
import com.salesianostriana.dam.ejemplo05OneToMany.model.Curso;
import com.salesianostriana.dam.ejemplo05OneToMany.repos.AlumnoRepositorio;
import com.salesianostriana.dam.ejemplo05OneToMany.repos.CursoRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {

	private final AlumnoRepositorio alumnoRepositorio;
	private final CursoRepositorio cursoRepositorio;

	@PostConstruct
	public void ejecutar() {
		
		Alumno a1 = new Alumno();
		a1.setNombre("Pepe");
		a1.setApellidos("Perez");
		a1.setEmail("pepe.perez@gmail.com");

		Alumno a2 = new Alumno();
		a2.setNombre("Manuel");
		a2.setApellidos("Perez");
		a2.setEmail("manuel.perez@gmail.com");
		
		alumnoRepositorio.save(a1);
		alumnoRepositorio.save(a2);

		Curso c = new Curso();
		c.setNombre("1º DAM");
		c.setTutor("Miguel");

		cursoRepositorio.save(c);

		/*
		a1.setCurso(c);
		a2.setCurso(c);

		alumnoRepositorio.save(a1);
		alumnoRepositorio.save(a2);
		*/
		a1.addToCurso(c);
		a2.addToCurso(c);
		
		alumnoRepositorio.save(a1);
		alumnoRepositorio.save(a2);
		
		/*
		List<Curso> cursos = 
				cursoRepositorio.findAll();

		for(Curso curso:cursos){
			System.out.println(curso);
		}*/
		
		System.out.println(c);
		for(Alumno a : c.getAlumnos()) {
			System.out.println(a);
		}
	}
	
}
