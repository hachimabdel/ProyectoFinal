package com.salesianostriana.dam.ProyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Categoria {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
	}

}
