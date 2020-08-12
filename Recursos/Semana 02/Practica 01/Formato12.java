/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "FORMATO12.java."

import java.io.*;

public class formato12 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String am_pm;
		int horas;
		int minutos;
		System.out.println("Ingrese horas [Formato 24]");
		horas = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese minutos [Formato 24]");
		minutos = Integer.parseInt(bufEntrada.readLine());
		if ((horas<0 || horas>24)) {
			System.out.println("Valor incorrecto");
		} else {
			if (horas>12) {
				horas = horas-12;
				am_pm = "PM";
			} else {
				am_pm = "AM";
			}
			System.out.println("La hora es "+horas+":"+minutos+" "+am_pm);
		}
	}


}

