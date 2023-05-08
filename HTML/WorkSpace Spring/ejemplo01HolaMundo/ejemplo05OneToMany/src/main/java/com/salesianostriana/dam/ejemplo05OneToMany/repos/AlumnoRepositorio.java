package com.salesianostriana.dam.ejemplo05OneToMany.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplo05OneToMany.model.Alumno;

public interface AlumnoRepositorio extends JpaRepository <Alumno, Long> {

}
