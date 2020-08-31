/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Punto;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un punto con el constructor por defecto:
        Punto p1 = new Punto();
        //ubicar punto en el plano: 
        p1.setX(5);
        p1.setY(-5);
        //mostrar datos del punto:
        System.out.println("Punto p1: " + p1.mostrarPunto());
        System.out.println("Se encuentra en cuadrante: " + p1.conocerCuadrante());
        System.out.println("Distancia al origen: " + p1.calcularDistancia());
    }
}
