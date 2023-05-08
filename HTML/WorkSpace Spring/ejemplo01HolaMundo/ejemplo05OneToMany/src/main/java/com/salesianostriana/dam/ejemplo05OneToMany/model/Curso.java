package com.salesianostriana.dam.ejemplo05OneToMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Curso {
	@Id
	@GeneratedValue
	
	private Long Id;
	
	private String nombre, tutor;
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	//En 1DAM todo lo que sea ToMany le pones el fetch que tenemos mas abajo
	@OneToMany(mappedBy="curso", fetch = FetchType.EAGER)
	@Builder.Default
	private List<Alumno> alumnos = new ArrayList<>();
	
	

}
