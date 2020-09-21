/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Bidon extends Carga {

    private float capacidad;
    private float densidad;

    public Bidon(String contenido, float capacidad, float densidad) {
        super(contenido);
        this.capacidad = capacidad;
        this.densidad = densidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    //métodos propios:
    
    @Override
    public float calcularPeso() {
        return capacidad * densidad;
    }

    @Override
    public String toString() {
        return super.toString() + " |Capacidad: " + capacidad + " |Densidad:" + densidad;
    }
}
