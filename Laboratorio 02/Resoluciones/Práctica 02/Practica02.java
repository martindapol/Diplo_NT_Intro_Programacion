/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARTIN
 */
public class Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short t = 5;
        int y = 10;
        System.out.println(t + y);
        float i = t + y;
        System.out.println(i + y);

        int i = 12;
        int j = 13;
        System.out.print(++i);
        System.out.print(i + j);

        int num1 = 143;
        int num2 = 57;
        byte num3 = (byte) (num1 + num2);
        System.out.println("Suma num1 + num2 como byte: " + num3);

        int x = 11, y = 5;
        int z = x * y - x++ + --x / y;
        System.out.println("Resultado: " + z);

        int x = 30, y = 20;
        System.out.println("Porcentaje: " + y / x * 100);

    }

}
