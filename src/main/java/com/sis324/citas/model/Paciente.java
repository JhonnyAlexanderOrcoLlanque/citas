package com.sis324.citas.model;
import jakarta.persistence.*;

@Entity
@Table(name="Paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

	private Long id;
	private String nombre;
	private String email;
	private String contrasena;
    private String direccion;
    private double telefono;
    private int cuentaBancaria;
    private String fechaNacimiento;
	private String historialMedico;

    
    //private boolean activo;
    
    //Constructores
    public Paciente() {
        
    }

    public Paciente(Long id, String nombre, String email, String contrasena, String direccion,
                    double telefono, int cuentaBancaria, String fechaNacimiento, String historialMedico) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.fechaNacimiento = fechaNacimiento;
        this.historialMedico = historialMedico;
        //this.activo = true;
    }

    
    

    public void eliminarPaciente() {
        //this.activo = false;
    }

    public void realizarPago(){
        //       IMPLEMENTAR
    }


    //Set y get
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public int getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(int cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }
	
}