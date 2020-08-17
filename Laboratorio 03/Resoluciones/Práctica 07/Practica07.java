/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA07.java."

import java.io.*;
import java.math.*;

public class practica07 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cont13;
		double dist;
		double distmay;
		int i;
		int n;
		boolean primero;
		double x1;
		double xmay;
		double y1;
		double ymay;
		primero = true;
		cont13 = 0;
		do {
			System.out.println("Ingrese cantidad de puntos: ");
			n = Integer.parseInt(bufEntrada.readLine());
		} while (n<=0);
		for (i=1;i<=n;i++) {
			System.out.println("Ingrese coordenada x del punto: ");
			x1 = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingrese coordenada y del punto: ");
			y1 = Double.parseDouble(bufEntrada.readLine());
			dist = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
			if ((x1>0 && y1>0) || (x1<0 && y1<0)) {
				cont13 = cont13+1;
			}
			if (primero==true) {
				xmay = x1;
				ymay = y1;
				distmay = dist;
				primero = false;
			} else {
				if (dist>distmay) {
					xmay = x1;
					ymay = y1;
					distmay = dist;
				}
			}
		}
		// salidas:
		System.out.println("Cantidad de puntos ubicados en cuadrante I o III: "+cont13);
		System.out.println("El punto con mayor distancia al origen es: ("+xmay+";"+ymay+")");
	}


}

