/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA03.java."

import java.io.*;

public class Practica03 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double lado;
		double perimetro;
		System.out.println("Ingrese lado del cuadrado en cm");
		lado = Double.parseDouble(bufEntrada.readLine());
		perimetro = lado*4;
		System.out.println("El perímetro es: "+perimetro+" cm");
	}


}

