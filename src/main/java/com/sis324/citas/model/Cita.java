package com.sis324.citas.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private Long pacienteId;
    private Long medicoId;
    private LocalDate fechaAtencion;
    private LocalTime horaAtencion;
    private Long idCola;
    private String estadoCita;



    //Constructor vacío necesario para JPA
    public Cita() {}

    public Cita(Long pacienteId, Long medicoId, LocalDate fechaAtencion, LocalTime horaAtencion, Long idCola) {
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.fechaAtencion = fechaAtencion;
        this.horaAtencion = horaAtencion;
        this.idCola = idCola;
        this.estadoCita = "pendiente";
    }

    // private boolean validarCita(){
    //     List<Medico> listaMedicos = medicoRepository.findAll();
       
    //     for (Medico medico : listaMedicos) {
    //         Long idMedico = medico.getId();
    //         if(idMedico == medicoId)
    //             return true;
    //     }

    //     return false;
    // }

    //Métodos getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public Long getIdCola() {
        return idCola;
    }

    public void setIdCola(Long idCola) {
        this.idCola = idCola;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }
}

