package com.salesianostriana.dam.ProyectoFinal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @Entity
public class Empleado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codEmpleado;
	
	private String nombre;
	private String apellidos;
	
	@DateTimeFormat (iso = ISO.DATE)
	private LocalDate fechaAlta;
	
	public Empleado(String nombre, String apellidos, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaAlta = fechaAlta;
	}

}
