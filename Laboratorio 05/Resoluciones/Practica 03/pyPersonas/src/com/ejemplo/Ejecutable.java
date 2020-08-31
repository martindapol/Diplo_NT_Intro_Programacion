package com.ejemplo;

import com.ejemplo.dominio.Persona;
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
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Persona p1 = new Persona();
        
        //Tomar nombre,edad y sexo por teclado:
        System.out.println("Ingrese nombre: ");
        p1.setNombre(sc2.nextLine());

        System.out.println("Ingrese Edad: ");
        p1.setEdad(sc.nextInt());

        System.out.println("Ingrese Sexo: [H/M]: ");
        p1.setSexo(sc2.next().charAt(0));
       
        //valores fijos de peso y altura 
        p1.setAltura(1.5F);
        p1.setPeso(80); //Caso de prueba: persona con sobrepeso
        
        //Validar IMC e informar:
        int imc = p1.calcularIMC();
        switch(imc){
            case 0:{
                System.out.println("La persona se encuentra por debajo de su peso ideal");
                break;
            }
            case 1:{
                System.out.println("La persona se encuentra con sobrepeso");
                break;
            }
            case -1:{
                System.out.println("La persona se encuentra en su peso ideal");
                break;
            }
        }
        
        //Datos del objeto:
        System.out.println(p1);
        //NOTA:
        //Queda a cargo del alumno crear las otras dos instancias del persona
        //indicadas en el enunciado.
    }

}
