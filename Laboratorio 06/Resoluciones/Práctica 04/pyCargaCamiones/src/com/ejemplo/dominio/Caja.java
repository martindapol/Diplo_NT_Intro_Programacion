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
public class Caja extends Carga{
    private float peso;

    public Caja(float peso, String contenido) {
        super(contenido);
        this.peso = peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public float peso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + " |Peso: " + peso;
    }
}
