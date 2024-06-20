package com.sis324.gestionColas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String pacienteId;
    private String medicoId;
    private String fechaAtencion;
    private String horaAtencion;
    private String idCola;
    private String estadoCita;

    // Constructor vacío (por defecto)
    public Cita() {
    }

    // Constructor con todos los atributos
    public Cita(long id, String pacienteId, String medicoId, String fechaAtencion,
                String horaAtencion, String idCola, String estadoCita) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.fechaAtencion = fechaAtencion;
        this.horaAtencion = horaAtencion;
        this.idCola = idCola;
        this.estadoCita = estadoCita;
    }

    //Metodos
    void generarRecibo(){
        //IMPLEMENTAR
    }

    // Métodos getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(String medicoId) {
        this.medicoId = medicoId;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getIdCola() {
        return idCola;
    }

    public void setIdCola(String idCola) {
        this.idCola = idCola;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
}