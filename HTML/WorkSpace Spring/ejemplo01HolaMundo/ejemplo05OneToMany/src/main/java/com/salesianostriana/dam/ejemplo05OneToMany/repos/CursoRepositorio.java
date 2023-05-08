package com.salesianostriana.dam.ejemplo05OneToMany.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplo05OneToMany.model.Curso;

public interface CursoRepositorio extends JpaRepository <Curso, Long>{

}
