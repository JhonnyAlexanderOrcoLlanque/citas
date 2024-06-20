package com.sis324.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.citas.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}