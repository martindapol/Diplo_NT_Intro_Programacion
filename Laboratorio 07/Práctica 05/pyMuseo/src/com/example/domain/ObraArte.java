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
public class ObraArte extends ObjetoExp{
    private String autor;
    private String pais;

    public ObraArte() {
    }

    public ObraArte(String autor, String pais, int cod, String nombre, int anio) {
        super(cod, nombre, anio);
        this.autor = autor;
        this.pais = pais;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("| Autor: ");
        sb.append(autor);
        sb.append("| País: ");
        sb.append(pais);
      
        return sb.toString();
    }

    @Override
    public String getNombre() {
        return super.getNombre() + "(" + pais + ")"; //To change body of generated methods, choose Tools | Templates.
    } 
}
