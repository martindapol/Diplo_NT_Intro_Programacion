
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARTIN
 */
public class Practica05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, volumen;
        Scanner input = new Scanner(System.in);
        
        //Entrada:
        System.out.println("Ingrese el radio de la esfera:");
        radio = input.nextFloat();
        
        //Proceso:
        volumen = Math.PI * (4.0/3.0) * Math.pow(radio, 3);
        
        //Salida:
        System.out.println("Volumen de la esfera de radio: " + radio + " es: " + volumen);
    }
    
}
