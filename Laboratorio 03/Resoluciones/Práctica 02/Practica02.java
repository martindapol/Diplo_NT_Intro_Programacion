/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA02.java."

import java.io.*;

public class practica02 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int anio;
		System.out.println("Ingrese año: ");
		anio = Integer.parseInt(bufEntrada.readLine());
		if (((anio%4==0 && !(anio%100==0)) || anio%400==0)) {
			System.out.println("Año bisiesto");
		} else {
			System.out.println("Año NO bisiesto");
		}
	}


}

