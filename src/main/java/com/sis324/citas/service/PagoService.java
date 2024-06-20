package com.sis324.gestionColas.service;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis324.gestionColas.model.Pago;
import com.sis324.gestionColas.repository.PagoRepository;


@Service

public class PagoService {
    @Autowired
    PagoRepository pagoRepos;

    public ArrayList<Pago> getPagos(){
        return ((ArrayList<Pago>) pagoRepos.findAll());
    }

    public Pago save(Pago pago){
        return (pagoRepos.save(pago));
    }

    public boolean delete(Long id){
		try {
			pagoRepos.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
