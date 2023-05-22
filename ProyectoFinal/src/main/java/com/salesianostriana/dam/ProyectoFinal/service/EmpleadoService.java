package com.salesianostriana.dam.ProyectoFinal.service;

import java.util.List;

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
	
	public void delete(Empleado a) {
		adminRepo.delete(a);
	}
	public List<Empleado> findAll(){
		return adminRepo.findAll();
	}
	public Empleado findById(long id) {
		return adminRepo.findById(id).orElse(null);
	}
	public void delete(long id) { adminRepo.deleteById(id); }
	
	
	
	
}
