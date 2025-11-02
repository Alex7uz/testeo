package com.clinica_Veterinaria.cliVete.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ListadoDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_amo;
    private String apellido_amo;

    public ListadoDTO() {}

    public ListadoDTO(String nombre_mascota, String especie, String raza, String nombre_amo, String apellido_amo) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_amo = nombre_amo;
        this.apellido_amo = apellido_amo;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
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

    public String getNombre_amo() {
        return nombre_amo;
    }

    public void setNombre_amo(String nombre_amo) {
        this.nombre_amo = nombre_amo;
    }

    public String getApellido_amo() {
        return apellido_amo;
    }

    public void setApellido_amo(String apellido_amo) {
        this.apellido_amo = apellido_amo;
    }
}
