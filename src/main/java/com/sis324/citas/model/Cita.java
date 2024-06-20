
package com.sis324.citas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private long medicoId;
    private long idCola;
    private long pacienteId;
    private String fechaAtencion;
    private String horaAtencion;
    private String estadoCita;

    public Cita() {
    }

    public Cita(long id, long pacienteId, long medicoId,  long idCola, 
            String fechaAtencion, String horaAtencion, String estadoCita) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.fechaAtencion = fechaAtencion;
        this.horaAtencion = horaAtencion;
        this.idCola = idCola;
        this.estadoCita = estadoCita;
    }

    public void generarRecibo(){
       
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(long medicoId) {
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

    public long getIdCola() {
        return idCola;
    }

    public void setIdCola(long idCola) {
        this.idCola = idCola;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
}
