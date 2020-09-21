/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.Objects;

/**
 *
 * @author MARTIN
 */
public abstract class Carga implements Comparable<Carga>{
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

    //Exponer un criterio de comparación
    @Override
    public int compareTo(Carga t) {
        int criterio = 0;
        if(this.calcularPeso()>t.calcularPeso())
            criterio = 1;
        else
            if(this.calcularPeso()<t.calcularPeso())
                criterio = - 1;
   
        return criterio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carga other = (Carga) obj;
        if (!Objects.equals(this.contenido, other.contenido)) {
            return false;
        }
        return true;
    }

   
}
