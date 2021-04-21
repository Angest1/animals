package com.angelo.animales.model;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private int id;
    private String nombre;
    private String tipo;
    private String zona;
    private String alimentacion;
    private String reproduccion;

    public Animal(int id, String nombre, String tipo, String zona, String alimentacion, String reproduccion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.zona = zona;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

}
