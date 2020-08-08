
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MARTIN
 */
public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int billetes1000, billetes500, billetes200, billetes100, monto;
        int resto1000, resto500, resto200;
        Scanner input = new Scanner(System.in);

        //Entradas:
        System.out.println("Ingrese cantidad de dinero a extraer (Múltiplo de 100):");
        monto = input.nextInt();
        //Proceso:
        billetes1000 = monto / 1000;
        resto1000 = monto % 1000;
        billetes500 = resto1000 / 500;
        resto500 = resto1000 % 500;
        billetes200 = resto500 / 200;
        resto200 = resto500 % 200;
        billetes100 = resto200 / 100;
        
        //Salidas:
        System.out.println("Total de billetes de 1000: " + billetes1000);
        System.out.println("Total de billetes de 500: " + billetes500);
        System.out.println("Total de billetes de 200: " + billetes200);
        System.out.println("Total de billetes de 100: " + billetes100);
    }

}
