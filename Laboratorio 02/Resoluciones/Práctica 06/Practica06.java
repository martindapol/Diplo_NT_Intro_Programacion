
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
public class Practica06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado1, lado2, lado3, sp, area;
        Scanner input = new Scanner(System.in);
        
        //Entradas:
        System.out.println("Ingrese lado1 del triángulo:");
        lado1 = input.nextDouble();
        System.out.println("Ingrese lado2 del triángulo:");
        lado2 = input.nextDouble();
        System.out.println("Ingrese lado3 del triángulo:");
        lado3 = input.nextDouble();
        
        //Proceso:
        sp = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
        
        //Salida:
        System.out.println("'El área del triángulo de lado: " + lado1 + ", " + lado2 + ", " + lado3 + " es: " + area);
    }
    
}
