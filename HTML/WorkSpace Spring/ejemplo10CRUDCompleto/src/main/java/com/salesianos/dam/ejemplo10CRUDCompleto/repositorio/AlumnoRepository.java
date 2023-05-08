package com.salesianos.dam.ejemplo10CRUDCompleto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianos.dam.ejemplo10CRUDCompleto.model.Alumno;


public interface AlumnoRepository  extends JpaRepository <Alumno, Long> {

}
