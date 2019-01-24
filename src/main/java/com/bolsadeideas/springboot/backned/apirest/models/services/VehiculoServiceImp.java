package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backned.apirest.models.dao.IVehiculoDao;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Vehiculo;

@Service
public class VehiculoServiceImp  implements IVehiculoService{

	@Autowired
	private IVehiculoDao vehiculoDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>) vehiculoDao.findAll();
	}
	

	@Override
	@Transactional(readOnly=true)
	public Vehiculo findById(Long id) {	
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Vehiculo save(Vehiculo Vehiculo) {
		return vehiculoDao.save(Vehiculo);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		vehiculoDao.deleteById(id);
	}
}
