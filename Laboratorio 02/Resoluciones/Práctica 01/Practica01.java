/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber?a llamarse "PRACTICA01.java."

import java.io.*;

public class Practica01 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int horas;
		int min;
		int resto;
		int seg;
		int tiempo;
		// Entradas:
		System.out.println("Ingrese cantidad de segundos a convertir: ");
		tiempo = Integer.parseInt(bufEntrada.readLine());
		// Proceso:
		horas = Math.round(tiempo/3600); // Math.round podría obviarse
                                                 // puesto que la división entre 
                                                 //enteros se resuelve en entero
		resto = tiempo%3600;
		min = Math.round(resto/60);
		seg = resto%60;
		// Salidas:
		System.out.println("Resultado: "+horas+":"+min+":"+seg);
	}
}