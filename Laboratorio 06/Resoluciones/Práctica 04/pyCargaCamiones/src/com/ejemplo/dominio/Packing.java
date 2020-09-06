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
public class Packing extends Carga {
    private float pesoEstructura;
    private float pesoCaja;
    private int cantidadCajas;

    public Packing(float pesoEstructura, float pesoCaja, int cantidadCajas, String contenido) {
        super(contenido);
        this.pesoEstructura = pesoEstructura;
        this.pesoCaja = pesoCaja;
        this.cantidadCajas = cantidadCajas;
    }

    public float getPesoEstructura() {
        return pesoEstructura;
    }

    public void setPesoEstructura(float pesoEstructura) {
        this.pesoEstructura = pesoEstructura;
    }

    public float getPesoCaja() {
        return pesoCaja;
    }

    public void setPesoCaja(float pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    @Override
    public float peso() {
        return cantidadCajas * pesoCaja + pesoEstructura;
    }

    @Override
    public String toString() {
        return super.toString() + " |Peso por caja: " + pesoCaja + " |Cantidad de cajas: " 
                + cantidadCajas + " |Peso estructura: " + pesoEstructura; 
    }

}
