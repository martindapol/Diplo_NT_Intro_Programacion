package ejemplo;

import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    public static void main(String[] args) {
        //declarar variables:
        Scanner entrada = new Scanner(System.in);
        Scanner lectorCadena = new Scanner(System.in);

        int n, tipo; // tipo es 1: Velero | 2: Lancha
        String nombre, nombreMayor;
        float monto, acuVelero, acuLancha, montoMayor, cuotaPromedio;
        boolean primerVelero = false;

        //inicializar las variables:
        acuVelero = acuLancha = 0; //asignación múltiple 
        nombreMayor = "";
        montoMayor = 0;

        //Leer datos de entrada:
        do {
            System.out.println("Ingrese la cantidad de embarcaciones a procesar: ");
            n = entrada.nextInt();
        } while (n <= 0); //mientras que sea negativo o cero vuelve a pedir

        //Procesar lote de datos:
        for (int i = 0; i < n; i++) {
            //Leer datos de cada embarcación:
            System.out.println("Ingrese Nombre de la embarcación: ");
            nombre = lectorCadena.nextLine();

            do {//validar que solo ingrese 1 o 2
                System.out.println("Ingrese tipo de embarcación 1: Velero |2:Lancha");
                tipo = entrada.nextInt();

                if (tipo < 1 || tipo > 2) {
                    System.out.println("Valor incorrecto! Ingrese 1 o 2");
                }

            } while (tipo < 1 || tipo > 2);

            System.out.println("Ingrese monto mensual de la cuota: ");
            monto = entrada.nextFloat();

            if (tipo == 1) {
                acuVelero = acuVelero + monto; // acuVelero += monto;

                if (primerVelero == false) {
                    nombreMayor = nombre; // el primer mayor encontrado:
                    montoMayor = monto;
                    primerVelero = true;
                } else if (monto > montoMayor) {
                    nombreMayor = nombre; //el último mayor encontrado
                    montoMayor = monto;
                }
            } else {
                acuLancha += monto; // acuVelero += monto;

            }
        }
       
        //Mostrar resultados
        cuotaPromedio = (acuVelero + acuLancha) / n;

        System.out.println("Total anual recaudado por veleros: " + (acuVelero * 12));
        System.out.println("Total anual recaudad por lanchas: " + (acuLancha * 12));

        if (primerVelero == true) {
            System.out.println("El nombre del velero con la mayor cuota es: " + nombreMayor + " con un importe de " + montoMayor);

        }
        System.out.println("Cuota mensual promedio: $ " + cuotaPromedio);
    }
}
