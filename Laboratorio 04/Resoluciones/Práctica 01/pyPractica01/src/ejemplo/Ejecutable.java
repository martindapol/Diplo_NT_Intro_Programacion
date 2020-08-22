package ejemplo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        Random rand = new Random();
        int cPos = 0, cNeg = 0;
        int[] numeros = new int[100];
        float sumaPos = 0, sumaNeg = 0;

        //cargar arreglo:
        for (i = 0; i < 100; i++) {
            numeros[i] = rand.nextInt();
        }

        //recorrer el array para sumar por separado números positivos 
        // y negativos 
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0) { //sumar positivos
                sumaPos += numeros[i];
                cPos++;
            } else if (numeros[i] < 0) { //sumar negativos
                sumaNeg += numeros[i];
                cNeg++;
            }
        }

        //Resultados:
        if (cPos != 0) {
            System.out.println("Media de valores positivos: " + sumaPos / cPos);
        } else {
            System.out.println("No se han generado números positivos");
        }
        if (cNeg != 0) {
            System.out.println("Media de valores negativos: " + sumaNeg / cNeg);
        } else {
            System.out.println("No se han generado números negativos");
        }
    }
}