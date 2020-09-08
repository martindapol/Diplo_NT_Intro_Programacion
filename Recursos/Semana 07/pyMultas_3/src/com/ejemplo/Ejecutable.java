package com.ejemplo;

import com.ejemplo.dominio.Caminera;
import com.ejemplo.dominio.Multa;
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
        float monto, total = 0; //acumulador
        int conteo[] = new int[20];
        Caminera oCaminera = null;
        int cod;
        long acta;
        Multa x = null; // referencia a un objeto multa
        
        //validar n:
        do {
            System.out.println("Ingrese la cantidad de actas a procesar:");
            n = entrada.nextInt();
        } while (n <= 0);

        oCaminera = new Caminera(n);
        //Entrada:
       
        for (int i = 0; i < n; i++) {
            //leer código de infracción:
            do {
                System.out.println("Ingrese código de la multa: ");
                cod = entrada.nextInt();
            } while (cod < 1 || cod > 20);
            
            //leer monto de la infracción:
            System.out.println("Ingrese monto de la multa: ");
            monto = entrada.nextFloat();
            
            //leer número de acta:
            System.out.println("Ingrese Nº de acta: ");
            acta = entrada.nextLong();
            
            x = new Multa(acta, cod, monto);//se crea la multa
            oCaminera.registrarMulta(x); //registrando la multa a la caminera
           
        } //Procesos:
              
        
        //Salidas:
        total = oCaminera.calcularTotal();
        System.out.println("Monto total recaudado: " + total);
        
        conteo = oCaminera.contabilizarCodigosMulta();
        for (int i = 0; i < conteo.length; i++) {
            if(conteo[i]>0)
                System.out.println("Actas código:  " + (i+1) + ": " + conteo[i]);
        }
        
        System.out.println(oCaminera.mostrarMayorCodigo());
    }
}
