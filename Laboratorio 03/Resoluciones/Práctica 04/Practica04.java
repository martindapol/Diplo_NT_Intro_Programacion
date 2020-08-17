/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA04.java."

import java.io.*;

public class practica04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String articulo;
		int clave;
		double precio;
		double preciofinal;
		System.out.println("Ingrese nombre del artículo: ");
		articulo = bufEntrada.readLine();
		System.out.println("Ingrese clave del artículo [1|2]: ");
		clave = Integer.parseInt(bufEntrada.readLine());
		if (clave==1 || clave==2) {
			System.out.println("Ingrese precio del artículo: ");
			precio = Double.parseDouble(bufEntrada.readLine());
			if (clave==1) {
				preciofinal = precio*0.9;
			} else {
				preciofinal = precio*0.8;
			}
			System.out.println("Articulo: "+articulo+" |Clave: "+clave+" |Precio original $: "+precio+" |Precio condescuento $: "+preciofinal);
		} else {
			System.out.println("Error de carga. Valor de clave incorrecto!");
		}
	}


}

