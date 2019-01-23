package com.bolsadeideas.springboot.backned.apirest.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backned.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Mascota;
import com.bolsadeideas.springboot.backned.apirest.models.services.IClienteService;
import com.bolsadeideas.springboot.backned.apirest.models.services.IMascotaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MascotaRestController {


		@Autowired
		private IMascotaService mascotaService;
		
		@GetMapping("/mascotas")
		public List<Mascota> index(){
			return mascotaService.findAll();
		}
		
		@GetMapping("/mascotas/{id}")
		public Mascota show(@PathVariable Long id){
		  return mascotaService.findById(id);
		}
		
		@PostMapping("/mascotas")
		@ResponseStatus(HttpStatus.CREATED)
		public Mascota create(@RequestBody Mascota cliente) {
			return mascotaService.save(cliente);
		}
		
		@PutMapping("/mascotas/{id}")
		public Mascota update(@RequestBody Mascota mascota, @PathVariable Long id) {
			Mascota mascotaActual = mascotaService.findById(id);
			mascotaActual.setNombre(mascota.getNombre());
			mascotaActual.setFecha_nacimiento(new Date());
			return mascotaService.save(mascotaActual);
		}
		
		
		@DeleteMapping("/mascotas/{id}")
		//responde un 204
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			System.out.println("MASCOTAAAAAAAAAAAAAA id: "+id);
			mascotaService.delete(id);
		}
}
