package com.salesianostriana.dam.ProyectoFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.ProyectoFinal.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	@Query("select c from Categoria c where c.nombre = a")
	public List<Categoria> findNombre();

}
