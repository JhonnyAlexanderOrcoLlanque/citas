package com.sis324.gestionColas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.gestionColas.model.Cola;

@Repository
public interface ColaRepository extends JpaRepository<Cola, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}