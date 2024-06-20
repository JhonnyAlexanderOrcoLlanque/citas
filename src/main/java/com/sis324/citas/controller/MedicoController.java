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
import com.sis324.citas.service.MedicoService;
import com.sis324.citas.model.Medico;

@RestController
@RequestMapping("/Medicos")
public class MedicoController {
	
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public ArrayList<Medico> showMedicos(){
		return medicoService.getMedicos();
	}
	
	@PostMapping
	public Medico insert(@RequestBody Medico medico){
		return medicoService.save(medico);
	}
	
	@PutMapping
    
	public Medico edit(@RequestBody Medico medico){
		return medicoService.save(medico);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return medicoService.delete(id);
	}    
}