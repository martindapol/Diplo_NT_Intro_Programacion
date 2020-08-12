package ejemplo;


import java.io.*;
public class Formato12 {
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

