package com.sis324.gestionColas.service;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis324.gestionColas.repository.MedicoRepository;
import com.sis324.gestionColas.model.Medico;
@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    public ArrayList<Medico> getMedicos(){
        return ((ArrayList<Medico>) medicoRepository.findAll());
    }

    public Medico save(Medico medico){
        return (medicoRepository.save(medico));
    }

    public boolean delete(Long id){
		try {
			medicoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
