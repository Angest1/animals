package com.angelo.animales.model;

public class Acuatico extends Animal{
    private String profundidad;


    public Acuatico(int id, String nombre, String tipo, String zona, String alimentacion, String reproduccion, String profundidad) {
        super(id, nombre, tipo, zona, alimentacion, reproduccion);
        this.profundidad = profundidad;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
