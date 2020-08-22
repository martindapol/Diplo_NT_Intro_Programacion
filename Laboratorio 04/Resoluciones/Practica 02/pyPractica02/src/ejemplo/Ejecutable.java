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
        int n, cIguales;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Prueba Estadística****\n");

        //Entrada: cantidad de lanzamientos 'n':
        do {
            System.out.println("Ingrese la cantidad de lanzamientos: (>0)");
            n = entrada.nextInt();
        } while (n <= 0);

        cIguales = 0;//inicializamos el contador
        //arreglos de lanzamientos
        int dado1[] = new int[n];
        int dado2[] = new int[n];
        //Carga de lanzamientos de ambos dados:
        for (int i = 0; i < n; i++) {
            dado1[i] = ((int) (Math.random() * 6)) + 1;
            dado2[i] = ((int) (Math.random() * 6)) + 1;

            if (dado1[i] == dado2[i]) {
                cIguales++;//A medida que se generan los valores contabilizamos
            }                           // las coincidencias
        }
        int hasta = n - 1; // último índice del arreglo

        System.out.println("\nDado 1:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == hasta) {
                System.out.print(dado1[i]);
            } else {
                System.out.print(dado1[i] + "|");
            }
        }
        System.out.println("]");

        System.out.println("\nDado 2:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == hasta) {
                System.out.print(dado2[i]);
            } else {
                System.out.print(dado2[i] + "|");
            }
        }
        System.out.println("]");

        //Total de coincidencias:
        System.out.println("Cantidad de veces en que se obtuvo el mismo valor en "
                + "ambos dados: " + cIguales);
        float porc = (cIguales * 100) / n;
        System.out.println("Porcentaje sobre el total de lanzamientos: " + porc + "%");

        //Buscar lanzamiento de la primer suma impar:
        int suma;
        for (int i = 0; i < n; i++) {
            suma = dado1[i] + dado2[i];
            if (suma % 2 != 0) {
                System.out.println("Lanzamiento: " + (i + 1) + " SUMA IMPAR!");
                break;
            }
        }
    }
}
