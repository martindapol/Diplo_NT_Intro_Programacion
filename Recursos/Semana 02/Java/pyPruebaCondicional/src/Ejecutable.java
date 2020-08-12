
import java.util.Scanner;

public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer un número y determinar si es o no par siempre que sea un positivo.
        //Caso de no ser no hacer nada!

        int num;
        
        System.out.println("Ingrese un número: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("El número es PAR!");
            } else {
                System.out.println("El número NO es PAR");
            }

        }

    }

}
