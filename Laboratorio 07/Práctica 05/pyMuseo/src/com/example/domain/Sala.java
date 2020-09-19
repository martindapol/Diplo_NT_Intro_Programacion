/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class Sala {
    private String nombre;
    private String ala;
    private List<ObjetoExp> lst;

    public Sala() {
        lst = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }
    
    public void addObjeto(ObjetoExp o){
        lst.add(o);
    }

    @Override
    public String toString() {
        return nombre;
    }
   
    public String mostrarObjetos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala: ");
        sb.append(nombre);
        sb.append(" |Ala: ");
        sb.append(ala);
        sb.append("\n");
        
        for (ObjetoExp obj : lst) {
            sb.append(obj.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public int getTotalObjetos(){
        return lst.size();        
    }
    
    public int calcularCtdObjetos(int antiguedad){
        int c = 0;
        for (ObjetoExp obj : lst) {
            if(obj.antiguedad()>= antiguedad)
                c++;
        }
        return c;
    }
    
    public List<ObjetoExp> getObjetos(){
        return lst;
    }
    
}
