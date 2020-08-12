
import java.util.Scanner;
import java.util.Random;

public class Practica32 {

    public static void main(String args[]) {
        //variables:
        int op, posicionX, posicionY;
        boolean b = false;
        //lector + generador de números aleatorios:
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();

        // inicializamos la posición del robot:
        posicionX = (int) (Math.random() * 101); //Podemos hacerlo mediante Math.random();
        posicionY = r.nextInt(100); //Podemos hacerlo utilizando un clase específica que genera aleatorios

        do {
            // Mostrar la posici�n actual del robot:
            System.out.println("TITO está en (" + posicionX + "," + posicionY + ")");
            System.out.println("1. Girar al Norte y avanzar 10 pasos");
            System.out.println("2. Girar al Sur y avanzar 20 pasos");
            System.out.println("3. Girar al Este y avanzar 10 pasos");
            System.out.println("4. Girar al Oste y avanzar 10 pasos");
            System.out.println("5. Salir");
            // leer la opción que elija el usuario:
            op = entrada.nextInt();
            switch (op) {
                case 1: {
                    posicionY = posicionY + 10;
                    break;
                }
                case 2: {
                    posicionY = posicionY - 20;
                    break;
                }
                case 3: {
                    posicionX = posicionX + 10;
                    break;
                }
                case 4: {
                    posicionX = posicionX - 20;
                    break;
                }
                case 5: {
                    System.out.println("Adios TITO! ");
                    break;
                }
                default: {
                    System.out.println("Opción incorrecta! ");
                }
            }
        } while (op != 5);
    }
}