/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA32.java."

import java.io.*;
import java.math.*;

public class practica32 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int op;
		int posicionx;
		int posiciony;
		// inicializamos la posición del robot:
		posicionx = Math.floor(Math.random()*100);
		posiciony = Math.floor(Math.random()*100);
		do {
			// Mostrar la posición actual del robot:
			System.out.println("TITO está en ("+posicionx+","+posiciony+")");
			System.out.println("1. Girar al Norte y avanzar 10 pasos");
			System.out.println("2. Girar al Sur y avanzar 20 pasos");
			System.out.println("3. Girar al Este y avanzar 10 pasos");
			System.out.println("4. Girar al Oste y avanzar 10 pasos");
			System.out.println("5. Salir");
			// leer la opción que elija el usuario:
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				posiciony = posiciony+10;
				break;
			case 2:
				posiciony = posiciony-20;
				break;
			case 3:
				posicionx = posicionx+10;
				break;
			case 4:
				posicionx = posicionx-20;
				break;
			case 5:
				System.out.println("Adios TITO! ");
				break;
			default:
				System.out.println("Opción incorrecta! ");
			}
		} while (op!==5);
	}


}

