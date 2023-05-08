package com.salesianos.dam.ejemplo10CRUDCompleto.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianos.dam.ejemplo10CRUDCompleto.model.Alumno;
import com.salesianos.dam.ejemplo10CRUDCompleto.repositorio.AlumnoRepository;

@Service
public class AlumnoServicio {
	
private AlumnoRepository alumnoRepository;
	
	public AlumnoServicio(AlumnoRepository repo) {
		this.alumnoRepository = repo;
	}
	
	public Alumno add(Alumno a) { return alumnoRepository.save(a); }

	public Alumno edit(Alumno a) { return alumnoRepository.save(a); }

	public void delete(Alumno a) { alumnoRepository.delete(a); }

	public void delete(long id) { alumnoRepository.deleteById(id); }

	public List<Alumno> findAll() { return alumnoRepository.findAll(); }

	public Alumno findById(long id) {
		return alumnoRepository.findById(id).orElse(null);
	}
}
