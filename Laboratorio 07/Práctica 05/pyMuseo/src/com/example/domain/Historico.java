/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author MARTIN
 */
public class Historico extends ObjetoExp{
    private String zona;
    private String origen;

    public Historico() {
        super();
    }
    
    public Historico(int cod, String nombre, int anio) {
        super(cod, nombre, anio);
        zona = "Desconocida";
        origen = "Desconocido";
    }

    public Historico(String zona, String origen, int cod, String nombre, int anio) {
        super(cod, nombre, anio);
        this.zona = zona;
        this.origen = origen;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("| Zona: ");
        sb.append(zona);
        sb.append("| Oriren: ");
        sb.append(origen);
      
        return sb.toString();
    }
    
    
    @Override
    public String getNombre() {
        return super.getNombre() + "(" + zona + ")"; 
    }

    
   
    
    
    
    
}
