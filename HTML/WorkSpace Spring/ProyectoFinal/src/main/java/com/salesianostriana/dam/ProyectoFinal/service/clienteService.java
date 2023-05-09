package com.salesianostriana.dam.ProyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ProyectoFinal.model.cliente;
import com.salesianostriana.dam.ProyectoFinal.repository.clienteRepository;

@Service
public class clienteService /*extends servicioBase<>*/{
	
	private clienteRepository clienteRepo;
	
	public clienteService (clienteRepository clienServ) {
		this.clienteRepo=clienServ;
	}
	
	public cliente add (cliente a) {
		return clienteRepo.save(a);
	}
	
	public cliente edit (cliente a) {
		return clienteRepo.save(a);
	}
	

}
