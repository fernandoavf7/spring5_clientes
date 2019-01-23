package com.bolsadeideas.springboot.backned.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Mascota;

public interface IMascotaDao extends CrudRepository<Mascota, Long>{}
