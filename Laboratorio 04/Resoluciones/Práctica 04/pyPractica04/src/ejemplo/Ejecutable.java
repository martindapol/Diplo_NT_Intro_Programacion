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
        int n; // cantidad de actas labradas
        Scanner entrada = new Scanner(System.in);
        float total = 0;
        
        //Entrada: cantidad de actas labradas
        do {
            System.out.println("Ingrese la cantidad de actas labradas: (>0)");
            n = entrada.nextInt();
        } while (n <= 0);

        //arreglos: cuando tienen información relacionada en las componentes
        //homólogas (con el mismo índice), se los llama arreglos paralelos.
        int codigos[] = new int[n];
        float importes[] = new float[n];
        
        //cargar arreglos con los datos de las actas:
        for (int i = 0; i < n; i++) {
            //validar que los códigos ingresados esten dentro del rango [1:20]
            do {
                System.out.println("Ingrese código de infracción [Entre 1 y 20]");
                codigos[i] = entrada.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 20);

            System.out.println("Ingrese monto de la infracción");
            importes[i] = entrada.nextFloat();
            total += importes[i]; // acumular a medida que se ingresan los montos
        }
        
        //Declarar vector auxiliar de conteo
        int conteo[] = new int[20]; // 20 componentes, 1 por cada código de infracción
        
        //Recorrer el vector de códigos y contar cantidad de ocurrencias de cada
        //código de infracción labrado:
        for (int i = 0; i < n; i++) {
            //Para contar utilizar la técnica de acceso directo:
            conteo[codigos[i]-1]++; // Si codigo[i] es igual 4 contamos 1 unidad
                                    // en la posición 4-1=3 del vector de conteo.
        }
        
        //Buscar la posición del mayor valor en el vector de conteo:
        int mayor = conteo[0];
        int posicion = 1;
        
        for (int i = 1; i < conteo.length; i++) {
            if(conteo[i]>mayor){
                mayor = conteo[i];
                posicion = i+1; //si se encuentra en la posición 4
                                //entonces corresponde al código de infracción 5
            }
        }
        
        //Mostrar resultados:
        System.out.println("Total facturado en el último fin de semana: $" + total);
        System.out.println("Códigos de acta labrados: ");
        for (int i = 0; i < conteo.length; i++) {
            if(conteo[i] > 0)
                System.out.println("Código " + (i+1) + ":" + conteo[i]);
        }
        System.out.println("Código de infracción más frecuente: " + posicion);
    }

}
