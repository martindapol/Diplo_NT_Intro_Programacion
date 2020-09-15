/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public class Camion {

    private float cargaMax;
    private int estado;
    private ArrayList<Carga> cargas;

    public Camion() {
        estado = 1; //Disponible 
        cargas = new ArrayList<>();

    }

    public Camion(float cargaMax) {
        estado = 1; //Disponible 
        cargas = new ArrayList<>();
        this.cargaMax = cargaMax;
    }

    //getters y setter para el viernes
    
    
    public float calcularPeso(){
        float aux = 0;
        for (Carga x : cargas) {
            aux += x.calcularPeso();
        }
        return aux;
    }
    
    
    public boolean subir(Carga carga){
        boolean aux = false;
        
        float pesoTotal = this.calcularPeso() + carga.calcularPeso();
        if(estado == 1 && pesoTotal<=cargaMax)
        {
            cargas.add(carga);
            aux = true;
        }        
        return aux;
    }
    
    
    
}
