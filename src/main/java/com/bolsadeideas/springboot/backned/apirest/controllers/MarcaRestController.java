package com.bolsadeideas.springboot.backned.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Marca;
import com.bolsadeideas.springboot.backned.apirest.models.services.MarcaService;

@CrossOrigin(origins= {com.bolsadeideas.springboot.backned.apirest.SpringBootBackendApirestApplication.angularOrigin})
@RestController
@RequestMapping("/api")
public class MarcaRestController {

	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/marcas")
	public List<Marca> getMarcas(){
		return marcaService.findAll();
	}
}
