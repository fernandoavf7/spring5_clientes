package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> findAll();
	
	public Vehiculo findById(Long id);
	
	public Vehiculo save(Vehiculo vehiculo);
	
	public void delete(Long id);
}

