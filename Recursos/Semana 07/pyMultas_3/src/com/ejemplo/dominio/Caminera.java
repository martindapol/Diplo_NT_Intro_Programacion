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
    
    public boolean registrarMulta(Multa x){
        boolean aux = false;
        if(ultimaCarga<multas.length){
            multas[ultimaCarga] = x;
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
    
    public int[] contabilizarCodigosMulta(){
        int conteo[] = new int[20];
        int pos;
        
        //Contar códigos de actas labradas:
        for (int i = 0; i < multas.length; i++) {
            pos = multas[i].getCodigo()-1; // si leo código 3 cuento en la posición 2
            conteo[pos]++; //acceso directo para conteo
        }
        return conteo;
    }
    
    public String mostrarMayorCodigo(){
       String aux = null;
       int may, codMay;
       int conteo[] = this.contabilizarCodigosMulta();
        //Buscar el código de infracción que más se presentó:
        
        may = conteo[0];
        codMay = 1;
        for (int i = 1; i < conteo.length; i++) {
            if(conteo[i]> may){
                may = conteo[i];
                codMay = i+1;
            }
        }
       aux = "Código de infracción mas frecuente: " + codMay + ", con: " + may 
               + "actas labradas";
       return aux;
    }
}
