/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA08.java."

import java.io.*;
import java.math.*;

public class practica08 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int coordenadax;
		int coordenaday;
		int op;
		// Generar posición inicial aleatoria del robot
		coordenadax = Math.floor(Math.random()*100);
		coordenaday = Math.floor(Math.random()*100);
		do {
			// Mostrar posición del robot:
			System.out.println("Tito en ("+coordenadax+";"+coordenaday+")");
			System.out.println("");
			System.out.println("1) Girar al norte y avanzar 10 pasos");
			System.out.println("2) Girar al sur y avanzar 10 pasos");
			System.out.println("3) Girar al este y avanzar 10 pasos");
			System.out.println("4) Girar al oeste y avanzar 10 pasos");
			System.out.println("5) Salir");
			System.out.println("Seleccione una opción");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				coordenaday = coordenaday+10;
				break;
			case 2:
				coordenaday = coordenaday-20;
				break;
			case 3:
				coordenadax = coordenadax+10;
				break;
			case 4:
				coordenadax = coordenadax-20;
				break;
			default:
				System.out.println("Opción incorrecta!");
			}
		} while (op!=5);
	}


}

