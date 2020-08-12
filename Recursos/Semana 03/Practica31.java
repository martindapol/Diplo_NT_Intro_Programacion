/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA31.java."

import java.io.*;

public class practica31 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean anterior;
		boolean avisopi;
		int ci;
		int cp;
		int num;
		boolean paridad;
		boolean paso0;
		// variable bandera o flag:
		// inicializar las variables auxiliares: contadores/acumuladores/banderas
		cp = 0;
		ci = 0;
		// asumir que no pasó
		paso0 = false;
		// asumir que la secuencia viene como Par-Impar
		avisopi = true;
		anterior = false;
		// Entrada
		System.out.println("Ingrese un valor entero. Finaliza con un negativo");
		num = Integer.parseInt(bufEntrada.readLine());
		// Proceso: ciclo + conteo y las validaciones
		// comienza el while:  
		while (num>=0) {
			paridad = num%2==0;
			if (paridad==true) {
				// Pares:
				// Contador = Contador + Cantidad fija
				cp = cp+1;
			} else {
				// Impares
				ci = ci+1;
			}
			if (num==0) {
				// predndemos la bandera
				paso0 = true;
			}
			if (paridad==anterior) {
				avisopi = false;
			}
			// valor de  paridad de la lectura anterior
			anterior = paridad;
			System.out.println("Ingrese un valor entero. Finaliza con un negativo");
			num = Integer.parseInt(bufEntrada.readLine());
			// Termina el while
		}
		// Salidas: luego del ciclo
		System.out.println("Cantidad de pares: "+cp+" y de impares: "+ci);
		if (paso0==true) {
			System.out.println("Paso al menos un cero!");
		}
		if (avisopi==true) {
			System.out.println("Paso secuencia Par-Impar");
		}
	}


}

