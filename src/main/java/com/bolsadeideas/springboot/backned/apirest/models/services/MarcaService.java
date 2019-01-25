package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backned.apirest.models.dao.IMarcaDao;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Marca;

@Service
public class MarcaService {

	@Autowired
	private IMarcaDao marcaDao;
	
	@Transactional(readOnly=true)
	public List<Marca> findAll(){
		return (List<Marca>) marcaDao.findAll();
	}
}
