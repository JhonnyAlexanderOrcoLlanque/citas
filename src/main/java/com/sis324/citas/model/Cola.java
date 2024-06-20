package com.sis324.citas.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cola")
public class Cola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String nombre;
    

    //Constructores
    public Cola() {
    }

    public Cola(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}