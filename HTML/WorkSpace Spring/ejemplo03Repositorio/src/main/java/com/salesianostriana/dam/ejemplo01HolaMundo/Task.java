package com.salesianostriana.dam.ejemplo01HolaMundo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Task {
	@Id
	@GeneratedValue
	private Long Id;
	
	private String title;
	private boolean done;
	private LocalDateTime limitDate;

	

}
