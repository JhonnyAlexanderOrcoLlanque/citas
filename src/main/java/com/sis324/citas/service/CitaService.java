//CitaService.java
package com.sis324.citas.service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sis324.citas.repository.CitaRepository;
import com.sis324.citas.model.Cita;

@Service
public class CitaService {
    @Autowired
    CitaRepository citaRepos;

    public ArrayList<Cita> getCitas(){
        return ((ArrayList<Cita>) citaRepos.findAll());
    }

    public Cita save(Cita cita){
        return (citaRepos.save(cita));
    }

    public boolean delete(Long id){
		try {
			citaRepos.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
