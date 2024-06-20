package com.sis324.citas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Pago")
public class Pago {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private long pacienteId;
    private long medicoId;
    private double monto;
    private String fecha;

    // Constructores
    public Pago() {
    }

    public Pago(long id, long pacienteId, long medicoId, double monto, String fecha) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Métodos
    public void deletePago() {
        // Implementar
    }

    // Métodos getters y setters
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
