/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MARTIN
 */
public class Camion {

    private float cargaMax;
    private int estado;
    private ArrayList<Carga> cargas;
    // private ArrayList<String> ejemplo;

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
    public float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float calcularPeso() {
        float aux = 0;
        for (Carga x : cargas) {
            aux += x.calcularPeso();
        }
        return aux;
    }

    public boolean subir(Carga carga) {
        boolean aux = false;

        if (carga != null) {
            float pesoTotal = this.calcularPeso() + carga.calcularPeso();
            if (estado == 1 && pesoTotal <= cargaMax) {
                cargas.add(carga);
                aux = true; //aviso
            }
        }

        return aux;
    }

    public int totalCargas() {
        return cargas.size();
    }

    public ArrayList<Carga> getListadoCargas() {
        Collections.sort(cargas, new CriterioPeso());
        return cargas;
    }

    public String mostrarListado() {
        Collections.sort(cargas, new CriterioPeso());
        StringBuilder sb = new StringBuilder("Listado de cargas\n");
        //StringBuilder optimiza la concatenación de cadenas

        //for each con iterador
        /*for (Iterator<Carga> iterator = cargas.iterator(); iterator.hasNext();) {
            Carga next = iterator.next();
             sb.append(next.toString()).append("\n");
        }*/
        //For each: una vuelta por cada elemento de la colección
        for (Carga carga : cargas) {
            sb.append(carga.toString()).append("\n");
        }
        return sb.toString();
    }

    public boolean estaListoParaSalir() {
        return (estado == 1 && this.calcularPeso() >= (0.75 * cargaMax));
    }
    
    public boolean bajar(Carga c){
        return cargas.remove(c);
    }   
}
