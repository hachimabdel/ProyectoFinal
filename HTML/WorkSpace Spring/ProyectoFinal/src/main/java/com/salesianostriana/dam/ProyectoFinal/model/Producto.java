package com.salesianostriana.dam.ProyectoFinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private float pvp;
	
	private float descuento;
	@Lob
	private String descripcion;
	
	@ManyToOne
	private Categoria categoria;
	
	public Producto(String nombre, String descripcion, float pvp, float descuento, String imagen, Categoria categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.descuento = descuento;
		this.categoria = categoria;
	}

}
