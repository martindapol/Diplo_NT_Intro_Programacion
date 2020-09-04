package com.ejemplo;

import com.ejemplo.dominio.Automovil;
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
        
        //Crear un vehículo:
        Automovil auto = new Automovil();
        //Cargar 10 lts de combustible
        auto.cargarCombustible(10);

        //Mostrar el estado inicial del auto:
        System.out.println("Nivel del tanque: " + auto.chequearTanque());
        System.out.println("Odómetro: " + auto.getOdometro());
        
        //Ingresar una cantidad de km a recorrer:
        int km;
        do{
            System.out.println("Ingrese la cantidad de km a recorrer: ");
            km = entrada.nextInt();
        }while(km <= 0);
        
        auto.conducir(km);
        //Mostrar el estado actualizado:
        System.out.println("Nivel del tanque: " + auto.chequearTanque());
        System.out.println("Odómetro: " + auto.getOdometro());
    }
}
