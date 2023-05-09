package com.salesianostriana.dam.ProyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ProyectoFinal.model.empleado;
import com.salesianostriana.dam.ProyectoFinal.repository.empleadoRepository;

@Service
public class empleadoService {
	
	private empleadoRepository adminRepo; 

	public empleadoService (empleadoRepository empServ) {
		this.adminRepo=empServ;
	}
	
	public empleado add(empleado a) {
		return adminRepo.save(a);
	}
	
	public empleado edit (empleado a) {
		return adminRepo.save(a);
	}
	
	
	
}
