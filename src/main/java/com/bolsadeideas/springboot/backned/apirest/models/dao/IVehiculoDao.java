package com.bolsadeideas.springboot.backned.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{}
