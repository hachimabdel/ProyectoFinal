package com.salesianostriana.dam.ejemplo01HolaMundo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {
	
	private String nombre;
	private String apellidos;

}
