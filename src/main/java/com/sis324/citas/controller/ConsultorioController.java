package com.sis324.gestionColas.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sis324.gestionColas.service.ConsultorioService;
import com.sis324.gestionColas.model.Consultorio;

@RestController
@RequestMapping("/Consultorios")
public class ConsultorioController {
	
	@Autowired
	private ConsultorioService consultorioService;
	
	@GetMapping
	public ArrayList<Consultorio> showConsultorios(){
		return consultorioService.getConsultorios();
	}
	
	@PostMapping
	public Consultorio insert(@RequestBody Consultorio consultorio){
		return consultorioService.save(consultorio);
	}
	
	@PutMapping
    
	public Consultorio edit(@RequestBody Consultorio consultorio){
		return consultorioService.save(consultorio);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return consultorioService.delete(id);
	}    
}