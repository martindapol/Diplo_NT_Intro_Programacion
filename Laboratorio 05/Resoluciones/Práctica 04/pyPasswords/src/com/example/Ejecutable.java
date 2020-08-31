/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.dominio.Password;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cant;
        //Ingresar cantidad de Password:
        do {            
            System.out.println("Ingrese la cantidad de password a procesar:");
            cant = entrada.nextInt();
        } while (cant<=0);
        //Ingresar tamaño de los passwords:
        int largo;
        do {            
            System.out.println("Ingrese longitud de los passwords:");
            largo = entrada.nextInt();
        } while (largo <=0);
        
        //crear los arreglos:
        Password arreglo[] = new Password[cant];
        boolean arreglo2[] = new boolean[cant];
        
        //Llenar arreglos:
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Password(largo);
            arreglo2[i] = arreglo[i].esFuerte();
        }
        
        // Mostrar resultados:
        System.out.println("Passwords generados\n");
        for (int i = 0; i < cant; i++) {
            System.out.print(arreglo[i] + " " + arreglo2[i] + "\n");
        }
        
  
    }

}
