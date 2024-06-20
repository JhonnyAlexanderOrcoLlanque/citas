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
import com.sis324.gestionColas.service.ColaService;
import com.sis324.gestionColas.model.Cola;

@RestController
@RequestMapping("/Colas")
public class ColaController {
	
	@Autowired
	private ColaService colaService;
	
	@GetMapping
	public ArrayList<Cola> showColas(){
		return colaService.getColas();
	}
	
	@PostMapping
	public Cola insert(@RequestBody Cola cola){
		return colaService.save(cola);
	}
	
	@PutMapping
    
	public Cola edit(@RequestBody Cola cola){
		return colaService.save(cola);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return colaService.delete(id);
	}    
}