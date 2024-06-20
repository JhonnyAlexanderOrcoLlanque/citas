package com.sis324.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.citas.model.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}