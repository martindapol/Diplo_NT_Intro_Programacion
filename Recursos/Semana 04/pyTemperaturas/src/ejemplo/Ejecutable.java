package ejemplo;

import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables:
        int n; // Cantidad de temperaturas
        Scanner entrada = new Scanner(System.in);
        float acumulador, promedio;
        boolean avisoMenos10 = false;

        //Inicializar variable
        acumulador = 0;

        //Entrada:
        do {
            System.out.println("Ingrese la cantidad de temperaturas a procesar: ");
            n = entrada.nextInt();
        } while (n <= 0);

        //Declarar y dimensionar un arreglo de n temperaturas
        float temperaturas[] = new float[n];
        
        //Proceso:
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ingrese la temperatura: " + (i + 1) + " en ºC");
            temperaturas[i] = entrada.nextFloat();
            acumulador = acumulador + temperaturas[i];

            if (temperaturas[i] <= -10) {
                avisoMenos10 = true;
            }
        }

        float aux;
        //Ordenar los valores de las temperaturas y luego mostrar:
        for (int i = 0; i < temperaturas.length - 1; i++) {
            for (int j = i + 1; j < temperaturas.length; j++) {
                if (temperaturas[i] < temperaturas[j]) {
                    aux = temperaturas[i];
                    temperaturas[i] = temperaturas[j];
                    temperaturas[j] = aux;
                }
            }
        }

        promedio = acumulador / n;
        String prom = String.format("%.2f", promedio);
        
        //Resultados:
        System.out.println("La temperatura promedio es de: " + prom + "ºC");
        if (avisoMenos10) {
            System.out.println("Pasó al menos 1 temperatura menor o igual a -10ºC");
        }

        //Mostrar el listado ordenado de temperaturas:
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura : " + (i + 1) + ": " + temperaturas[i]);
        }

    }

}
