/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA03.java."

import java.io.*;

public class practica03 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cartaj1;
		int cartaj2;
		int paloj1;
		int paloj2;
		int puntajej1;
		int puntajej2;
		puntajej1 = 0;
		puntajej2 = 0;
		System.out.println("RONDA 1:");
		System.out.println("Ingrese carta y palo del Jugador 1, recuerde [1-Copa|2-Basto|3-Espada|4-Oro]");
		cartaj1 = Integer.parseInt(bufEntrada.readLine());
		paloj1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese carta y palo del Jugador 2");
		cartaj2 = Integer.parseInt(bufEntrada.readLine());
		paloj2 = Integer.parseInt(bufEntrada.readLine());
		if (cartaj1>cartaj2) {
			puntajej1 = (cartaj1+cartaj2);
		} else {
			if (cartaj1<cartaj2) {
				puntajej2 = (cartaj1+cartaj2);
			} else {
				// Son cartas de igual valor, gana el que tenga oro
				if (paloj1==4) {
					puntajej1 = (cartaj1+cartaj2);
				} else {
					if (paloj2==4) {
						puntajej2 = (cartaj1+cartaj2);
					} else {
						puntajej1 = cartaj1;
						puntajej2 = cartaj2;
					}
				}
			}
		}
		System.out.println("RONDA 2:");
		System.out.println("Ingrese carta y palo del Jugador 1");
		cartaj1 = Integer.parseInt(bufEntrada.readLine());
		paloj1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese carta y palo del Jugador 2");
		cartaj2 = Integer.parseInt(bufEntrada.readLine());
		paloj2 = Integer.parseInt(bufEntrada.readLine());
		// NOTA: para la segunda ronda "acumulamos" los puntajes con los de la primer ronda
		if (cartaj1>cartaj2) {
			puntajej1 = puntajej1+(cartaj1+cartaj2);
		} else {
			if (cartaj1<cartaj2) {
				puntajej2 = puntajej2+(cartaj1+cartaj2);
			} else {
				if (paloj1==4) {
					puntajej1 = puntajej1+(cartaj1+cartaj2);
				} else {
					if (paloj2==4) {
						puntajej2 = puntajej2+(cartaj1+cartaj2);
					} else {
						puntajej1 = puntajej1+cartaj1;
						puntajej2 = puntajej2+cartaj2;
					}
				}
			}
		}
		if (puntajej1>puntajej2) {
			System.out.println("Gana Jugador 1 con: "+puntajej1+" puntos.");
		} else {
			if (puntajej1<puntajej2) {
				System.out.println("Gana Jugador 2 con: "+puntajej2+" puntos.");
			} else {
				System.out.println("Empate!!! con: "+puntajej1+" puntos.");
			}
		}
	}


}

