package com.sis324.gestionColas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.gestionColas.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    
}