
/*package com.sis324.citas.model;

import jakarta.persistence.*;
import com.sis324.citas.model.Cita;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Cola")
public class Cola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    private long id;
    private String nombre;
    private List<Cita> citas;

    //Constructores
    public Cola() {
    }

    public Cola(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.citas = new ArrayList<>();
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    // Método para añadir una cita a la lista de citas
    public void addCita(Cita cita) {
        this.citas.add(cita);
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
}*/

package com.sis324.citas.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Entity
@Table(name = "Cola")
public class Cola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cola_id")
    private List<Cita> citas = new ArrayList<>();

    // Constructores
    public Cola() {
    }

    public Cola(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Método para añadir una cita a la lista de citas en orden de fecha y hora
    public void addCita(Cita cita) {
        citas.add(cita);
        citas.sort(Comparator.comparing(Cita::getFechaAtencion).thenComparing(Cita::getHoraAtencion));
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
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
