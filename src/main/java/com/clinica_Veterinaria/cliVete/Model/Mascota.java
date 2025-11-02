package com.clinica_Veterinaria.cliVete.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String nombre;
    String especie;
    String raza;
    String color;
    @ManyToOne
    @JoinColumn(name = "id_amo")
    @JsonIgnore
    private Amo amo;


    public Mascota(){}

    public Mascota(long id, String nombre, String especie, String raza, String color, Amo amo) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.amo = amo;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Amo getAmo() {
        return amo;
    }

    public void setAmo(Amo amo) {
        this.amo = amo;
    }
}
