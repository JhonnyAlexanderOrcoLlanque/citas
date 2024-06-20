package com.sis324.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.citas.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    //Implementar
}

