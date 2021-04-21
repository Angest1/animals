package com.angelo.animales.model;

public class Volador extends Animal {
    private String altura;

    public Volador(int id, String nombre, String tipo, String zona, String alimentacion, String reproduccion, String altura) {
        super(id, nombre, tipo, zona, alimentacion, reproduccion);
        this.altura = altura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
