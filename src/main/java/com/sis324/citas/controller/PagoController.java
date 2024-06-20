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
import com.sis324.gestionColas.service.PagoService;
import com.sis324.gestionColas.model.Pago;

@RestController
@RequestMapping("/Pagos")
public class PagoController {
	
	@Autowired
	private PagoService pagoService;
	
	@GetMapping
	public ArrayList<Pago> showPago(){
		return pagoService.getPagos();
	}
	
	@PostMapping
	public Pago insert(@RequestBody Pago pago){
		return pagoService.save(pago);
	}
	
	@PutMapping
    
	public Pago edit(@RequestBody Pago pago){
		return pagoService.save(pago);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return pagoService.delete(id);
	}    
}