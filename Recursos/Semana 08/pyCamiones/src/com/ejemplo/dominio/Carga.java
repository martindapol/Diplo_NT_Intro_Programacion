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
public abstract class Carga {
    private final String contenido;

    public Carga(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
    
    public abstract float calcularPeso();  

    @Override
    public String toString() {
        return "Carga con: [" + contenido + "]";
    }
    
    
    
}
