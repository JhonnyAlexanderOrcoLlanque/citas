package com.sis324.citas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String nombre;
    private String especialidad;
    private String telefono;
    private String email;
    private long consultorioId;
    private long idCola;
    private int cuentaBancaria;
    
    // Constructores
    public Medico() {
    }

    public Medico(long id, int cuentaBancaria, String nombre, String especialidad, String telefono,
                  String email, long consultorioId, long idCola) {
        this.id = id;
        this.cuentaBancaria = cuentaBancaria;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.consultorioId = consultorioId;
        this.idCola = idCola;
    }

    // Métodos
    public void verCola() {
        // IMPLEMENTAR
    }

    public void verCita() {
        // IMPLEMENTAR
    }

    public void atenderCita() {
        
    }

    public void rechazarCita() {
        // IMPLEMENTAR
    }

    // Métodos getters y setters
    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getConsultorioId() {
        return consultorioId;
    }

    public void setConsultorioId(long consultorioId) {
        this.consultorioId = consultorioId;
    }

    public long getIdCola() {
        return idCola;
    }

    public void setIdCola(long idCola) {
        this.idCola = idCola;
    }
}
