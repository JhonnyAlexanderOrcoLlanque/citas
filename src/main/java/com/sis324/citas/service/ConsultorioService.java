package com.sis324.citas.service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sis324.citas.repository.ConsultorioRepository;
import com.sis324.citas.model.Consultorio;

@Service
public class ConsultorioService {
    @Autowired
    ConsultorioRepository consultorioRepos;

    public ArrayList<Consultorio> getConsultorios(){
        return ((ArrayList<Consultorio>) consultorioRepos.findAll());
    }

    public Consultorio save(Consultorio consultorio){
        return (consultorioRepos.save(consultorio));
    }

    public boolean delete(Long id){
		try {
			consultorioRepos.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
