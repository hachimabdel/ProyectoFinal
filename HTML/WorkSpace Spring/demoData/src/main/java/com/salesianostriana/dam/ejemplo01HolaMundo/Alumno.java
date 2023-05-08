package com.salesianostriana.dam.ejemplo01HolaMundo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "nombre_alumnado")
	private String nombre;
	private String apellidos;
	private String email;
	private LocalDate fechaNacimiento;

}
