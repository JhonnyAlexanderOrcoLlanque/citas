

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
import com.sis324.citas.service.PacienteService;
import com.sis324.citas.model.Paciente;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public ArrayList<Paciente> showPacientes(){
		return pacienteService.getPacientes();
	}
	
	@PostMapping
	public Paciente insert(@RequestBody Paciente paciente){
		return pacienteService.save(paciente);
	}
	
	@PutMapping
    
	public Paciente edit(@RequestBody Paciente paciente){
		return pacienteService.save(paciente);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return pacienteService.delete(id);
	}    
}