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
        int n = 10, cAbandonos; // 20 competidores
        float suma;
        float promedio;
        float menor;
        Scanner entrada = new Scanner(System.in);

        suma = 0;
        cAbandonos = 0;
        menor = 0;//valor inicial ficticio
        
        //cargar arreglo:
        float tiempos[] = new float[n];
        for (int i = 0; i < n; i++) {
            //validar que no se ingresen valores de tiempos negativos:
            do {
                System.out.println("Ingrese tiempo obtenido por el participante: " + (i + 1));
                tiempos[i] = entrada.nextFloat();
            } while (tiempos[i] < 0);

            suma += tiempos[i]; //A medida que se cargan los tiempos
            //se acumulan los valores registrados
        }

        //Contar abandonos:
        for (int i = 0; i < 10; i++) {
            if (tiempos[i] == 0) {
                cAbandonos++;
            }
        }

        //Ordenar arreglo de menor a mayor (Selección directa):
        float aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tiempos[i] > tiempos[j]) {
                    aux = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = aux;
                }
            }
        }

        //buscar primer tiempo != 0 (menor valor con el arreglo ordenado):
        for (int i = 0; i < n; i++) {
            if(tiempos[i]>0){
                menor = tiempos[i];
                break; // cortamos la búsqueda
            }
        }
        
        
        //Resultados:
        promedio = suma / n;
        System.out.println("Tiempo promedio: " + promedio + " min.");
        System.out.println("Cantidad de abandonos: " + cAbandonos + " participantes");
        System.out.println("Mejor tiempo de carrera: " + menor + " min.");
        System.out.println("Listado final: \n");

        int puesto = 0;
        for (int i = 0; i < n; i++) {
            if(tiempos[i]>0)
                System.out.println((++puesto) + "º: " + tiempos[i]);
        }
    }
}
