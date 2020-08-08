/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anioNac, edad, anioActual;
        Scanner input = new Scanner(System.in);

        //Año actual:
        anioActual = Calendar.getInstance().get(Calendar.YEAR);

        //Entradas:
        System.out.println("Ingrese Año de nacimiento: ");
        anioNac = input.nextInt();
        //Proceso:
        edad = anioActual - anioNac;
        //salidas:
        System.out.println("Su edad al 31 del " + anioActual + " es: " + edad);        
    }
}
