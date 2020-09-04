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
public class Automovil {
    private final Tanque tanque;
    private int odometro;

    public Automovil() {
        tanque = new Tanque();
        odometro = 0;
    }
    
    public int cargarCombustible(int lts){
        return tanque.agregarCombustible(lts);
    }
    
    public String chequearTanque(){
        String estado = "";
        float porcentaje;
        
        if(tanque.estaEnReserva()){
            estado = "En reserva";
        }else if (tanque.estaLleno()){
            estado = "Tanque lleno";
        }else{    
            porcentaje = tanque.getPorcentajeActual();
            estado = String.valueOf(porcentaje) + "%";
        }
        
        return estado;
    }
    
    
    public boolean conducir(int km){
        boolean respuesta = false;
        int ltsNecesarios = (km/11); // total de km divido 11 km x litro
        int faltante = tanque.consumirCombustible(ltsNecesarios);
        
        //Si hay litros suficientes entonces se recorren los km indicado.
        //Caso contrario no recorre 0 Km.
        if(faltante == 0){
            odometro += km;
            respuesta = true;
        }      
        return respuesta;
    }   

    public int getOdometro() {
       return odometro;
    }
}
