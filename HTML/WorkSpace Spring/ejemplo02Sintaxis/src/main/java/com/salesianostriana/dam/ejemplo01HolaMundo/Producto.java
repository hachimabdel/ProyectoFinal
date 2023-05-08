package com.salesianostriana.dam.ejemplo01HolaMundo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Producto {

	private String nombre;
	private String descripcion;
	private double precio;
	private int numeroVotos;
	private double porcentajeSatisfaccion;
}
