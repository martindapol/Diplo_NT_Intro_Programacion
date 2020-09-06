package com.ejemplo;

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
        //varibles:
        int n; // total de multas a procesar
        Scanner entrada = new Scanner(System.in);
        int codigos[]; // es una referencia al arreglo todavía sin definir
        float montos[];
        float total = 0; //acumulador
        int conteo[] = new int[20];
        int pos;
        int may, codMay;
        
        
        //validar n:
        do {
            System.out.println("Ingrese la cantidad de actas a procesar:");
            n = entrada.nextInt();
        } while (n <= 0);

        codigos = new int[n];
        montos = new float[n];
        //Entrada:

        for (int indice = 0; indice < codigos.length; indice++) {
            //leer código de infracción
            do {
                System.out.println("Ingrese código de la multa: ");
                codigos[indice] = entrada.nextInt();
            } while (codigos[indice] < 1 || codigos[indice] > 20);
            
            //leer monto de la infracción
            System.out.println("Ingrese monto de la multa: ");
            montos[indice] = entrada.nextFloat();
            //total = total + montos[indice];
            total += montos[indice];
        } //Procesos:
        
                
        //Contar códigos de actas labradas:
        for (int i = 0; i < codigos.length; i++) {
            pos = codigos[i]-1; // si leo código 3 cuento en la posición 2
            conteo[pos]++; //acceso directo para conteo
        }

        //Buscar el código de infracción que más se presentó:
        may = conteo[0];
        codMay = 1;
        for (int i = 1; i < conteo.length; i++) {
            if(conteo[i]> may){
                may = conteo[i];
                codMay = i+1;
            }
        }
               
        
        //Salidas:
        System.out.println("Monto total recaudado: " + total);
        for (int i = 0; i < conteo.length; i++) {
            if(conteo[i]>0)
                System.out.println("Actas código:  " + (i+1) + ": " + conteo[i]);
        }
        
        System.out.println("El código de infracción que más se presento es: " + codMay + ""
                + " con: " + may + " actas labradas.");
        
    }
}
