package com.bolsadeideas.springboot.backned.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Marca;

public interface IMarcaDao extends CrudRepository<Marca, Long>{

}
