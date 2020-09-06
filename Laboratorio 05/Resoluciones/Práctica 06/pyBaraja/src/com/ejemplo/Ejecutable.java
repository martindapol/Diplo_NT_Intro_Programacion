/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Baraja;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un maso de cartas:
        Baraja baraja = new Baraja();
        
        //Mezclar:
        baraja.barajar();
        
        //Mostrar estado del maso:
        System.out.println(baraja.mostrarBaraja());
        
        //Obtener y mostrar la siguiente carta:
        System.out.println("Próxima carta: " + baraja.siguienteCarta());
        
    }
    
}
