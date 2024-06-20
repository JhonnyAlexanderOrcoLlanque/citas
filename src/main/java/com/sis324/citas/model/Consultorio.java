package com.sis324.gestionColas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Consultorio")
public class Consultorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String nombre;
    private String ubicacion;

    //Constructores
    public Consultorio() {
    }

    public Consultorio(long id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }


    // Métodos getters y setters
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}