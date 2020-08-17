/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA01.java."

import java.io.*;

public class practica01 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String ampm;
		int hh;
		int hh12;
		int mm;
		System.out.println("Ingrese hora en formato 24: ");
		hh = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese minutos: ");
		mm = Integer.parseInt(bufEntrada.readLine());
		if (hh>12) {
			hh12 = (hh-12);
			ampm = "PM";
		} else {
			hh12 = hh;
			ampm = "AM";
		}
		System.out.println("La hora en formamto 12 es: "+hh12+":"+mm+" "+ampm);
	}


}

