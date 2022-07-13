package com.coderhouse.coderhouse.model;
import javax.persistence.*;
import java.util.Date;


//declarar todas mis vars.//
// getters&setters //
// cosntructores, siempre uno vacio(entity lo pide) y otro con los params,
//@ENTITTY Y @TABLE X LA db., lo mismo que @column y @id

@Entity
@Table( name = "CLIENTE")
public class Cliente {

    //Creacion de vars.

    @Column(name = "DNI")
    @Id
    private Long dni;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "EDAD")
    private int edad;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    //CONSTRUCTORES
    //Vacio x Entity.
    public Cliente() {
    }
    //constructor con params.
    public Cliente(Long dni, String nombre, String apellido, Date fechaNacimiento, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    //GETTERS & SETTERS.
    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    //Devolver JSON
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                '}';
    }

}

