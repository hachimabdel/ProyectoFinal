package com.salesianostriana.dam.ProyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ProyectoFinal.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
