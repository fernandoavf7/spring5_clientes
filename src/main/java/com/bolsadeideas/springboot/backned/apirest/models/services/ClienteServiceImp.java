package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backned.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Cliente;

/*
 * Los metodos de esta clase son proporcionados por CRUDRepository
 */
@Service
public class ClienteServiceImp implements IClienteService{


	@Autowired
	private IClienteDao clienteDao;
	
	
	@Override
	//sobreescribe la propiedad para decir que si sera transaccional
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {	
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

}
