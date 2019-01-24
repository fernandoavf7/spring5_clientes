package com.bolsadeideas.springboot.backned.apirest.controllers;


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

import com.bolsadeideas.springboot.backned.apirest.models.entity.Mascota;
import com.bolsadeideas.springboot.backned.apirest.models.entity.Vehiculo;
import com.bolsadeideas.springboot.backned.apirest.models.services.IMascotaService;
import com.bolsadeideas.springboot.backned.apirest.models.services.IVehiculoService;

@CrossOrigin(origins= {com.bolsadeideas.springboot.backned.apirest.SpringBootBackendApirestApplication.angularOrigin})
@RestController
@RequestMapping("/api")
public class VehiculoRestController {


		@Autowired
		private IVehiculoService vehiculoService;
					
		
		@GetMapping("/vehiculos")
		public List<Vehiculo> index(){
			return vehiculoService.findAll();
		}
		
		@GetMapping("/vehiculos/{id}")
		public Vehiculo show(@PathVariable Long id){
		  return vehiculoService.findById(id);
		}
		
		@PostMapping("/vehiculos")
		@ResponseStatus(HttpStatus.CREATED)
		public Vehiculo create(@RequestBody Vehiculo vehiculo) {
			return vehiculoService.save(vehiculo);
		}
		
		@PutMapping("/vehiculos/{id}")
		public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Long id) {
			Vehiculo objActual = vehiculoService.findById(id);
			objActual.setMarca(vehiculo.getMarca());
			objActual.setModelo(vehiculo.getModelo());
			return vehiculoService.save(objActual);
		}
		
		
		@DeleteMapping("/vehiculos/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			vehiculoService.delete(id);
		}
}
