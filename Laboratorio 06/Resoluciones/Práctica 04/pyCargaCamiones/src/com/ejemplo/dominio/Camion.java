/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author MARTIN
 */
public class Camion {
    private ArrayList<Carga> cargas;
    private int estado;
    private float cargaMaxima;

    public Camion() {
        cargas = new ArrayList<>();
        estado = 1;
        //1-Disponible
        //2-A reparación
        //3-En viaje
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void subirCarga(Carga unaCarga) {
        if (estado == 1 && (this.peso() + unaCarga.peso()) <= cargaMaxima) {
            cargas.add(unaCarga);
        }
    }

    public void bajarCarga(Carga unaCarga) {
        if (estado == 1 && !cargas.isEmpty()) {
            if (cargas.contains(unaCarga)) {
                cargas.remove(unaCarga);
            }
        }
    }

    public int totalDeCargas(){
        return cargas.size();
    }
    
    //métodos para actualizar el estado:
    public void aReparacion(){
        estado = 2;
    }
    
    public void enViaje(){
        estado = 3;
    }
    
    public void reparado(){
        estado = 1;
    }
    
    public void disponible(){
        estado = 1;
    }
    
    public float peso() {
        float peso = 0;
        for (Carga carga : cargas) {
            peso += carga.peso();
        }
        return peso;
    }
    
    public String listarCargasPorPeso(){
        Collections.sort(cargas);
        String listado = "";
        
        for (Carga carga : cargas) {
            listado += carga.toString() + "\n";
        }
        return listado;
    }
    
    public boolean listoParaSalir(){
        return this.estado == 1 && this.peso() >= (0.75 * cargaMaxima);
    }
}