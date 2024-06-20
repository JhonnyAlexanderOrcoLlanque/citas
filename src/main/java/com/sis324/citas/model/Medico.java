package com.sis324.gestionColas.model;

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
    private String consultorioId;
    private String idCola;
    private int cuentaBancaria;

    // Constructores
    public Medico() {
    }

    public Medico(long id, int cuentaBancaria, String nombre, String especialidad, String telefono,
                  String email, String consultorioId, String idCola) {
        this.id = id;
        this.cuentaBancaria = cuentaBancaria;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.consultorioId = consultorioId;
        this.idCola = idCola;
    }

    //Metodos
    public void verCola(){
        //IMPLEMENTAR
    }

    public void verCita(){
        //IMPLEMENTAR
    }

    public void atenderCita(){
        //IMPLEMENTAR
    }

    public void rechazarCita(){
        //IMPLEMENTAR
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

    public String getConsultorioId() {
        return consultorioId;
    }

    public void setConsultorioId(String consultorioId) {
        this.consultorioId = consultorioId;
    }

    public String getIdCola() {
        return idCola;
    }

    public void setIdCola(String idCola) {
        this.idCola = idCola;
    }
}


