package com.bolsadeideas.springboot.backned.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backned.apirest.models.services.IClienteService;

//se habilita el dominio cruzado para angular, si está vacio permitirá todo
@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/delete")
	public List<Cliente> delete(long id){
		return clienteService.findAll();
	}
}
