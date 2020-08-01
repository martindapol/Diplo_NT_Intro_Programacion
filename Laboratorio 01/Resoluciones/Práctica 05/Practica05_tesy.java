/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA05.java."

import java.io.*;
import java.math.*;

public class practica05 {

	public static void main(String args[]) {
		int dif;
		int num1;
		int num2;
		int prod;
		int sum;
		// Entrada:
		num1 = Math.floor(Math.random()*10);
		num2 = Math.floor(Math.random()*10);
		// Proceso:
		sum = num1+num2;
		dif = num1-num2;
		prod = num1*num2;
		// Salida:
		System.out.println("Numeros al azar: num1: "+num1+" y num2: "+num2);
		System.out.println("La suma es: "+sum);
		System.out.println("La diferencia es: "+dif);
		System.out.println("El producto es: "+prod);
	}


}

