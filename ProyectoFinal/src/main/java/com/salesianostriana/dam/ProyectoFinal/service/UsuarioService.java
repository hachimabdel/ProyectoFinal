package com.salesianostriana.dam.ProyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ProyectoFinal.model.Usuario;
import com.salesianostriana.dam.ProyectoFinal.repository.UsuarioRepository;

@Service
public class UsuarioService{
	
	private UsuarioRepository clienteRepo;
	
	public UsuarioService (UsuarioRepository clienServ) {
		this.clienteRepo=clienServ;
	}
	
	public Usuario add (Usuario a) {
		return clienteRepo.save(a);
	}
	
	public Usuario edit (Usuario a) {
		return clienteRepo.save(a);
	}
	

}
