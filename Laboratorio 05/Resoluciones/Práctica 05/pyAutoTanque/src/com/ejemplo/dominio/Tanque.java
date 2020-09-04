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
public class Tanque {

    private int capacidad;
    private int reserva;
    private int contenidoActual;

    public Tanque() {
        capacidad = 49;
        reserva = 5;
        contenidoActual = 0;
    }

    /**
     * Agregar los litros informados al contenido y devolver si derramamos
     * combustible"
     */
    public int agregarCombustible(int litros) {
        int derramado = 0;
        int capacidadTotal = this.capacidad + this.reserva;
        int nivelActual = litros + this.contenidoActual;

        if (nivelActual > capacidadTotal) { // se derrama combustible:
            derramado = nivelActual - capacidadTotal;
            contenidoActual = capacidadTotal;
        } else {// se carga 'litros' al contenido actual del tanque:
            contenidoActual += litros;
        }

        return derramado;
    }

    /**
     * Permite actualizar el estado del tanque cuando se recorren ciertos km.
     */
    public int consumirCombustible(int litros) {
        int faltante = 0;

        if (litros <= this.contenidoActual) {
            contenidoActual -= litros;
        } else {
            faltante = litros - contenidoActual;
            contenidoActual = 0;
        }

        return faltante;
    }
    
    public int capacidadTotal(){
        return (this.capacidad + this.reserva);
    }
    
    public boolean estaEnReserva(){
        return contenidoActual <= reserva;   
    }

    float getPorcentajeActual() {
        return (this.contenidoActual * 100)/ this.capacidadTotal();
    }

    boolean estaLleno() {
        return this.contenidoActual == capacidadTotal();
    }
}
