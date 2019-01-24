package com.bolsadeideas.springboot.backned.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backned.apirest.models.dao.IMascotaDao;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Mascota;

@Service
public class MascotaServiceImp implements IMascotaService{

	@Autowired
	private IMascotaDao mascotaDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<Mascota> findAll() {
		return (List<Mascota>) mascotaDao.findAll();
	}
	

	@Override
	@Transactional(readOnly=true)
	public Mascota findById(Long id) {	
		return mascotaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Mascota save(Mascota mascota) {
		return mascotaDao.save(mascota);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		mascotaDao.deleteById(id);
	}
}
