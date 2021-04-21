package com.angelo.animales.model;

public class Terrestre extends Animal {
    private String recorrido;

    public Terrestre(int id, String nombre, String tipo, String zona, String alimentacion, String reproduccion, String recorrido) {
        super(id, nombre, tipo, zona, alimentacion, reproduccion);
        this.recorrido = recorrido;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
