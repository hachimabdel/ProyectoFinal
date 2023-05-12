package com.salesianostriana.dam.ProyectoFinal.service;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ProyectoFinal.model.Empleado;
import com.salesianostriana.dam.ProyectoFinal.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	
	private EmpleadoRepository adminRepo; 

	public EmpleadoService (EmpleadoRepository empServ) {
		this.adminRepo=empServ;
	}
	
	public Empleado add(Empleado a) {
		return adminRepo.save(a);
	}
	
	public Empleado edit (Empleado a) {
		return adminRepo.save(a);
	}
	
	
	
}
