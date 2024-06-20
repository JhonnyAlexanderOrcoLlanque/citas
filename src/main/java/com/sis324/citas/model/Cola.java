package com.sis324.gestionColas.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="Cola")

public class Cola {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String nombre;
    private List<Paciente> pacientes;

    
    // Constructor
    public Cola(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }


    public static Cola createCola(long id, String nombre) {
        return new Cola(id, nombre);
    }

    public static Cola readCola(Cola cola) {
        return cola;
    }


    public static void deleteCola(Cola cola) {
        cola = null;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
    

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}