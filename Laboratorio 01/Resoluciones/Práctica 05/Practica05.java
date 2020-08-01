
import java.util.Random;

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
        int num1, num2, sum, dif, prod;
        
        Random r1 = new Random();
        
        //Entrada:
        num1 = r1.nextInt(10);
        num2 = r1.nextInt(10);
        //Procesos:
        sum = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        
        //Salidas:
        System.out.println("Numeros al azar: num1: " + num1 + " y num2: " + num2);
        System.out.println("La suma es: " + sum);
        System.out.println("La diferencia es: " + dif);
        System.out.println("El producto es: " + prod);
        
    }
    
}
