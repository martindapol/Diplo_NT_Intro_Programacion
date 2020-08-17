/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

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
        /*
        Problema: Dada un calificación de una App de un tienda de aplicaciones
        Mostrar la calificación correspondiente segun:
        1-Regular
        2-Muy Buena
        3-Recomendable
        Si es otra, indicar valor no permitido!
         */
        Scanner entrada = new Scanner(System.in);
        short calificacion;
        String valoracion = "";
        //Entrada:
        System.out.println("Ingrese la calificación de la app: ");
        calificacion = entrada.nextShort();

        //condicional multiple1:
        //Proceso y salida:
        switch (calificacion) {//empieza el switch
            case 1: {
                valoracion = "Calificación REGULAR";
                
            }
            case 2: {
                valoracion = "Calificación MUY BUENA";
                break;
            }
            case 3: {
                valoracion = "Calificación RECOMENDADA";
                break;
            }

            default: {
                valoracion = "Valor de calificación NO PERMITIDO!";
            }
        }//fin de switch 

        System.out.println(valoracion);
    }
}
