package com.salesianostriana.dam.ProyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ProyectoFinal.model.Cliente;
import com.salesianostriana.dam.ProyectoFinal.repository.ClienteRepository;

@Service
public class ClienteService{
	
	private ClienteRepository clienteRepo;
	
	public ClienteService (ClienteRepository clienServ) {
		this.clienteRepo=clienServ;
	}
	
	public Cliente add (Cliente a) {
		return clienteRepo.save(a);
	}
	
	public Cliente edit (Cliente a) {
		return clienteRepo.save(a);
	}
	

}
