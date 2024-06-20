package com.sis324.citas.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sis324.citas.model.Paciente;
import com.sis324.citas.repository.PacienteRepository;


@Service

public class PacienteService {
    
    @Autowired
    PacienteRepository pacienteRepository;

    public ArrayList<Paciente> getPacientes(){
        return ((ArrayList<Paciente>) pacienteRepository.findAll());
    }

    public Paciente save(Paciente paciente){
        return (pacienteRepository.save(paciente));
    }

    public boolean delete(Long id){
		try {
			pacienteRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

    /*
    public ArrayList<Paciente> verDisponibilidadMedico(Long id, Date date){
		ArrayList<Paciente> pacientes = (ArrayList<Paciente>) usuarioRepository.findAll();
		Medico csm = new Medico();
		for(Paciente x:pacientes) {
			if(x.getId()==(id)) {
				csm= x.getMedico();
			}
		}
		
		ArrayList<Cita> CitasUsersCSM = new ArrayList<Cita>();
		for(Paciente user: csm.getPaciente()) {
			CitasUsersCSM.addAll(user.getCita());
		}
		return CitasUsersCSM;
	
	}
    */
}
