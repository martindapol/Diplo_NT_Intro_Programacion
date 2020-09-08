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
public class Caminera {
    private Multa multas[];
    private int ultimaCarga;

    public Caminera(int cantidad) {
        multas = new Multa[cantidad];
        ultimaCarga = 0;
    }
    
    public boolean registrarMulta(Multa multa){
        boolean aux = false;
        if(ultimaCarga<multas.length){
            multas[ultimaCarga] = multa;
            aux = true;
            ultimaCarga++;
        }
        return aux;
    }
    
    public float calcularTotal(){
        float aux = 0;
        
        //for each:
        for (Multa x : multas) {
            if(x != null){
                aux += x.calcularMonto();
            }
        }
        
        return aux;
    }
    
}
