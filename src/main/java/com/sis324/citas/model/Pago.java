package com.sis324.gestionColas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Pago")
public class Pago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String pacienteId;
    private String medicoId;
    private double monto;
    private String fecha;

    // Constructores
    public Pago() {
    }

    public Pago(long id, String pacienteId, String medicoId, double monto, String fecha) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.monto = monto;
        this.fecha = fecha;
    }

    //Metodos
    public void deletePago(){
        //Implementar
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