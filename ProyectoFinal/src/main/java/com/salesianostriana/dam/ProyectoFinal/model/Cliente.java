package com.salesianostriana.dam.ProyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Cliente {
	
	@Id
	@GeneratedValue
	private long dni;
	
	private String nombre;
	private String apellidos;
	private String direccion;
	
	
	
	
	

}
