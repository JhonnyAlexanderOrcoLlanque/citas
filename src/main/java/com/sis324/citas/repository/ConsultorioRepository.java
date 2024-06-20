package com.sis324.gestionColas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.gestionColas.model.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}