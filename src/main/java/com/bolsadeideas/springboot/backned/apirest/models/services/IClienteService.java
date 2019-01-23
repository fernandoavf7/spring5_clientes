package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Cliente;

public interface IClienteService {


	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
