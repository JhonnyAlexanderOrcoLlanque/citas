package com.sis324.citas.service;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sis324.citas.repository.MedicoRepository;
import com.sis324.citas.model.Medico;



import java.util.List;
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


    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

}
