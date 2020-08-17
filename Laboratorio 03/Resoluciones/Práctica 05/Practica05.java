/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean aviso0;
		boolean avisopi;
		int ci;
		int cp;
		int num;
		boolean paractual;
		boolean parant;
		cp = 0;
		ci = 0;
		aviso0 = false;
		avisopi = true;
		parant = false;
		System.out.println("Ingrese un número:");
		num = Integer.parseInt(bufEntrada.readLine());
		while (num>=0) {
			paractual = num%2==0;
			if (paractual) {
				cp = cp+1;
			} else {
				ci = ci+1;
			}
			if (num==0) {
				aviso0 = true;
			}
			if (paractual==parant) {
				avisopi = false;
			}
			parant = paractual;
			System.out.println("Ingrese un número:");
			num = Integer.parseInt(bufEntrada.readLine());
		}
		System.out.println("Total de pares: "+cp);
		System.out.println("Total de impares: "+ci);
		if (aviso0==true) {
			System.out.println("Pasó al menos un cero");
		}
		if (avisopi==true) {
			System.out.println("Serie con alternancia P-I");
		} else {
			System.out.println("Serie sin alternancia P-I");
		}
	}


}

