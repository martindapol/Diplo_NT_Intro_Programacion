/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "GUARDERIANAUTICA.java."

import java.io.*;

public class guarderianautica {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acul;
		double acuv;
		boolean avisop;
		boolean false;
		double i;
		double may;
		double monto;
		int n;
		String nom;
		String nommay;
		String nom_may;
		double promedio;
		int tipo;
		boolean true;
		acul = 0;
		acuv = 0;
		avisop = false;
		System.out.println("Ingrese cantidad de barcos: ");
		n = Integer.parseInt(bufEntrada.readLine());
		for (i=0;i<=n;i++) {
			System.out.println("Ingrese nombre de la embarcación: ");
			nom = bufEntrada.readLine();
			System.out.println("Ingrese tipo de la embarcación: [1-Velero|2-Lancha] ");
			tipo = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese monto que paga mensualmente en $: ");
			monto = Double.parseDouble(bufEntrada.readLine());
			if (tipo==1) {
				acuv = acuv+monto*12;
				if (avisop==false) {
					may = monto;
					nom_may = nom;
					avisop = true;
				} else {
					if (monto>may) {
						may = monto;
						nom_may = nom;
					}
				}
			} else {
				acul = acul+monto*12;
			}
		}
		if (n>0) {
			promedio = (acul+acuv)/n;
		} else {
			promedio = 0;
		}
		System.out.println("Acumulado anual veleros $:"+acuv);
		System.out.println("Acumulado anual lanchas $:"+acul);
		if (avisop==true) {
			System.out.println("El velero que más pagó es: "+nommay+" un monto de $: "+may);
		}
		System.out.println("El promedio anual percibido es de $: "+promedio);
	}


}

