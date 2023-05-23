package com.salesianostriana.dam.ProyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Usuario  {

	@Id
	@GeneratedValue
	private Long id;


	private String nombre;
	private String apellidos;
	private String direccion;

	
}
