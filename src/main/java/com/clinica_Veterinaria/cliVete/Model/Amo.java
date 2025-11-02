package com.clinica_Veterinaria.cliVete.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Amo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String nombre;
    String apellido;
    int celular;
    int dni;
//    @OneToMany(mappedBy = "amo")
//    private List<Mascota> mascotas;

    @OneToMany(mappedBy = "amo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> mascotas;




    public Amo(){}


    public Amo(long id, String nombre, String apellido, int celular, int dni,List<Mascota> mascotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
        mascotas = mascotas;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
