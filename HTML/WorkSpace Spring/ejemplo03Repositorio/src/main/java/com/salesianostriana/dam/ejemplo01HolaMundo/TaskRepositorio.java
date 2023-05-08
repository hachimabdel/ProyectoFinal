package com.salesianostriana.dam.ejemplo01HolaMundo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositorio extends JpaRepository <Task, Long> {

}
