//CitaController.java
package com.sis324.citas.controller;

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
import com.sis324.citas.service.CitaService;
import com.sis324.citas.model.Cita;



@RestController
@RequestMapping("/Cita")
public class CitaController {
	
	@Autowired
	private CitaService citaService;
	
	@GetMapping
	public ArrayList<Cita> showCitas(){
		return citaService.getCitas();
	}
	
	@PostMapping
	public Cita insert(@RequestBody Cita cita){
		return citaService.save(cita);
	}
	
	@PutMapping
    
	public Cita edit(@RequestBody Cita cita){
		return citaService.save(cita);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return citaService.delete(id);
	}    
}