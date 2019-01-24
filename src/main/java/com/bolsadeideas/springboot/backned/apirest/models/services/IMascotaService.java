package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Mascota;

public interface IMascotaService {
	
	public List<Mascota> findAll();
	
	public Mascota findById(Long id);
	
	public Mascota save(Mascota mascota);
	
	public void delete(Long id);
}
