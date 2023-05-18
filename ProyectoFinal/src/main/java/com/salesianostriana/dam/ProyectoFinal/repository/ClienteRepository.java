package com.salesianostriana.dam.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ProyectoFinal.model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
