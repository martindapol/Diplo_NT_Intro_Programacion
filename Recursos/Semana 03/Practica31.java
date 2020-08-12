
import java.util.Scanner;

public class Practica31 {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
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
		num = entrada.nextInt();
	
                // Proceso: ciclo + conteo y las validaciones
		// comienza el while:  
		while (num>=0) {
			paridad = num % 2 == 0; //MOD equivale %(resto)
                        
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
			num = entrada.nextInt();
		}// Termina el while
                
		// Salidas: luego del ciclo
		System.out.println("Cantidad de pares: "+cp+" y de impares: "+ci);
		if (paso0) {
			System.out.println("Paso al menos un cero!");
		}
		if (avisopi==true) {
			System.out.println("Paso secuencia Par-Impar");
		}
	}
}

